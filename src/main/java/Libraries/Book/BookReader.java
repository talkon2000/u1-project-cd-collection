package Libraries.Book;

import Libraries.Book.Types.Book;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


/**
 * This is a utility class with one method that should parse the data from an input file into a list of Books
 */
public class BookReader {

    /**
     * This method should read every line in the file and create a number of Book objects
     * @param filename: file to get data from
     * @return a new list of every created Book object
     */
    public List<Book> getAllBooks(String filename) {

        List<Book> booksList = new ArrayList<>();
        try {
            FileInputStream input = new FileInputStream(filename);
            Reader csvReader = new InputStreamReader(input);

            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(csvReader);
            for (CSVRecord record : records) {
                //Ignores header line
                if (record.getRecordNumber() == 1) {
                    continue;
                }
                booksList.add(new Book(Integer.parseInt(record.get(0)), record.get(1), record.get(2)));
            }
        }
        catch (IOException | NullPointerException e) {
            System.out.println("An Exception occurred, so the file could not be read.");
            return null;
        }
        return booksList;
    }
}

