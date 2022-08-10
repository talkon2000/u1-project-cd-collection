package Collections.Book;

import Collections.Book.Types.Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
        InputStream input = this.getClass().getClassLoader().getResourceAsStream(filename);

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(",");
                int id = Integer.parseInt(splitLine[0]);
                String title = splitLine[1];
                String author = splitLine[2];
                booksList.add(new Book(id, title, author));
            }

            System.out.println("Reached end of file");
            reader.close();
        }
        catch (IOException | NullPointerException e) {
            System.out.println("An Exception occurred, so the file could not be read.");
            return null;
        }

        return booksList;
    }
}

