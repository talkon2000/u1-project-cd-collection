package Libraries;

public interface LibraryDriverImpl<CollectionImpl> {
    LibraryImpl getLibrary(String filename);
}