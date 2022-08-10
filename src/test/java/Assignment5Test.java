import Libraries.Book.BookDriver;
import Libraries.CD.CDDriver;
import Libraries.LibraryImpl;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Assignment5Test {

    @Test
    public void libraries_arePolymorphicallyInterchangeable() {
        Class<?> cdDriverClass = CDDriver.class;
        Class<?> bookDriverClass = BookDriver.class;

        Class<?>[] cdDriverClassInterfaces = cdDriverClass.getInterfaces();
        Class<?>[] bookDriverClassInterfaces = bookDriverClass.getInterfaces();

        assertTrue(1 == cdDriverClassInterfaces.length &&
                        1 == bookDriverClassInterfaces.length &&
                        cdDriverClassInterfaces[0] == bookDriverClassInterfaces[0],
                "Expected library classes to be polymorphically interchangeable!");

        Method[] libraryDriverImplMethods = cdDriverClassInterfaces[0].getMethods();

        assertTrue(1 == libraryDriverImplMethods.length,
                "Expected library drivers to have one common method!");

        assertTrue(LibraryImpl.class == libraryDriverImplMethods[0].getReturnType(),
                "Expected LibraryDriverImpl method to return LibraryImpl type!");

        Class<?>[] parameterTypes = libraryDriverImplMethods[0].getParameterTypes();
        assertTrue(1 == parameterTypes.length && String.class == parameterTypes[0],
                "Expected LibraryDriverImpl method to take single parameter of String type!");
    }
}
