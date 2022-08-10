package Libraries;


import java.util.List;

public interface LibraryImpl<T> {
    void displayLibrary();

    void sortLibrary();

    void addItem(Object o);

    List<T> getLibraryList();
}
