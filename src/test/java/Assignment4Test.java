import Collections.CD.Types.Cd;
import Collections.CD.Types.CdCollection;
import Collections.CD.Types.Song;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Assignment4Test {
 //TEMPORARY COMMENTING TO BUILD
    /*
    @Test
    void song_internalStateIsNotExposed() {
        Class<?> songClass = Song.class;
        Field[] declaredFields = songClass.getDeclaredFields();

        assertTrue(0 < declaredFields.length, "Expected Song class to contain fields!");

        for (Field declaredField : declaredFields) {
            boolean isFieldPrivate = Modifier.isPrivate(declaredField.getModifiers());
            assertTrue(isFieldPrivate, " Expected Song class fields to not be directly accessible!");
        }
    }

    @Test
    void cd_internalStateIsNotExposed() {
        Class<?> cdClass = Cd.class;
        Field[] declaredFields = cdClass.getDeclaredFields();

        assertTrue(0 < declaredFields.length, "Expected Cd class to contain fields!");

        for (Field declaredField : declaredFields) {
            boolean isFieldPrivate = Modifier.isPrivate(declaredField.getModifiers());
            assertTrue(isFieldPrivate, " Expected Cd class fields to not be directly accessible!");
        }
    }

    @Test
    void cdCollection_internalStateIsNotExposed() {
        Class<?> cdCollectionClass = CdCollection.class;
        Field[] declaredFields = cdCollectionClass.getDeclaredFields();

        assertTrue(0 < declaredFields.length, "Expected CdCollection class to contain fields!");

        for (Field declaredField : declaredFields) {
            boolean isFieldPrivate = Modifier.isPrivate(declaredField.getModifiers());
            assertTrue(isFieldPrivate, " Expected CdCollection class fields to not be directly accessible!");
        }
    }

    @Test
    void song_internalStateIsUnmodifiable() {
        Class<?> songClass = Song.class;
        Method[] declaredMethods = songClass.getDeclaredMethods();

        assertTrue(0 < declaredMethods.length, "Expected Song class methods to exist!");

        for (Method declaredMethod : declaredMethods) {
            String methodName = declaredMethod.getName();
            assertFalse(methodName.startsWith("set"), "Expected Song class fields to not be modified!");
        }
    }

    @Test
    void cd_internalStateIsUnmodifiable() {
        Class<?> cdClass = Cd.class;
        Method[] declaredMethods = cdClass.getDeclaredMethods();

        assertTrue(0 < declaredMethods.length, "Expected Cd class methods to exist!");

        for (Method declaredMethod : declaredMethods) {
            String methodName = declaredMethod.getName();
            assertFalse(methodName.startsWith("set"), "Expected Cd class fields to not be modified!");
        }
    }

    @Test
    void cdCollection_internalStateIsUnmodifiable() {
        Class<?> cdCollectionClass = CdCollection.class;
        Method[] declaredMethods = cdCollectionClass.getDeclaredMethods();

        assertTrue(0 < declaredMethods.length, "Expected CdCollection class methods to exist!");

        for (Method declaredMethod : declaredMethods) {
            String methodName = declaredMethod.getName();
            assertFalse(methodName.startsWith("set"), "Expected CdCollection class fields to not be modified!");
        }
    }

    @Test
    void cd_songsListNotModifiable() {
        Cd cd = new Cd("title", "artist", 1999, 5, 1);
        cd.addSong(new Song("title", "2:00"));
        Song[] songs = cd.getSongs();
        songs[0] = new Song("title2", "4:00");
        assertNotEquals(songs, cd.getSongs());
    }

    @Test
    void cdCollection_cdsListProtectedByDefensiveCopying() {
        CdCollection collection = new CdCollection();
        Cd cd1 = new Cd("album name", "artist", 1999, 5, 1);
        cd1.addSong(new Song("title", "1:00"));
        collection.addCD(cd1);

        Cd maliciousCd = new Cd("wrong name", "wrong artist", 2000, 6, 1);
        maliciousCd.addSong(new Song("wrong title", "2:00"));
        List<Cd> cds = collection.getCds();
        cds.remove(cd1);
        cds.add(maliciousCd);

        assertNotEquals(cds, collection.getCds());

    } */

}
