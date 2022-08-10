import Collections.CD.CDReader;
import Collections.CD.Types.Cd;
import Collections.CD.Types.CdCollection;
import Collections.CD.Types.Song;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Assignment3Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    CdCollection collection;
    Cd cd1;
    Cd cd2;
    Cd cd3;
    Cd cd4;

    @BeforeEach
    void setup() {
        cd1 = buildCd1();
        cd2 = buildCd2();
        cd3 = buildCd3();
        cd4 = buildCd4();
        String filename = "cds_short.txt";
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);
        if (cdsList == null) {
            System.out.println("Exiting...");
            return;
        }

        collection = new CdCollection();
        for (Cd cd : cdsList) {
            collection.addCD(cd);
        }
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void collection_hasAllCds() {
        Assertions.assertEquals(4, collection.getCds().size());
    }

    @Test
    void songDisplay() {
        Song song = new Song("This is a title", "4:00");
        song.displaySong();
        assertEquals("This is a title; 4:00", outputStreamCaptor.toString().trim());
    }

    @Test
    void cdDisplay() {
        Cd cd = new Cd("Title", "artiste", 1999, 4, 2);
        cd.addSong(new Song("first", "1:00"));
        cd.addSong(new Song("second", "2:00"));
        cd.displayCD();
        String expected = "Artist: artiste\nTitle: Title\nRelease year: 1999\nRating: 4\nSongs: \n" +
                "first; 1:00\nsecond; 2:00";
        assertEquals(expected, outputStreamCaptor.toString().trim());
    }

    @Test
    void collection_everyCdProperlyAdded() {
        List<Cd> cds = collection.getCds();
        assertTrue(cdsEqual(cd1, cds.get(0)));
        assertTrue(cdsEqual(cd2, cds.get(1)));
        assertTrue(cdsEqual(cd3, cds.get(2)));
        assertTrue(cdsEqual(cd4, cds.get(3)));
    }

    boolean cdsEqual(Cd cd1, Cd cd2) {
        if(cd1.getArtist().equals(cd2.getArtist()) &&
                cd1.getTitle().equals(cd2.getTitle()) &&
                cd1.getYear() == cd2.getYear() &&
                cd1.getRating() == cd2.getRating() &&
                cd1.getNumOfSongs() == cd2.getNumOfSongs()) {
            for (int i = 0; i < cd1.getSongs().size(); i++) {
                if (!cd1.getSongs().get(i).getTitle().equals(cd2.getSongs().get(i).getTitle()) ||
                        !cd1.getSongs().get(i).getLength().equals(cd2.getSongs().get(i).getLength())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    Cd buildCd1() {
        Cd cd1 = new Cd("Eternal Tears of Sorrow","Saivon Lapsi", 2013, 7, 13);
        cd1.addSong(new Song("Saivo", "1:10"));
        cd1.addSong(new Song("Dark Alliance","4:17"));
        cd1.addSong(new Song("Legion of Beast","4:05"));
        cd1.addSong(new Song("Kuura","1:01"));
        cd1.addSong(new Song("Dance of December","4:40"));
        cd1.addSong(new Song("The Day","4:14"));
        cd1.addSong(new Song("Sound of Silence","4:15"));
        cd1.addSong(new Song("Beneath the Frozen Leaves","5:30"));
        cd1.addSong(new Song("Swan Saivo","4:22"));
        cd1.addSong(new Song("Blood Stained Sea","4:06"));
        cd1.addSong(new Song("Angelheart Ravenheart (Act III: Saivon Lapsi)","7:30"));
        cd1.addSong(new Song("New Dawn","0:46"));
        cd1.addSong(new Song("Another One Falls Asleep","5:39"));
        return cd1;
    }

    Cd buildCd2() {
        Cd cd2 = new Cd("Blind Stare", "The Dividing Line", 2012, 6, 11);
        cd2.addSong(new Song("Cold New World","3:44"));
        cd2.addSong(new Song("Mind's Armor","4:12"));
        cd2.addSong(new Song("Bring Down the Tears","4:39"));
        cd2.addSong(new Song("Mindless Dreams","5:15"));
        cd2.addSong(new Song("Death and Rebirth","5:09"));
        cd2.addSong(new Song("Blessing of Freyja","3:28"));
        cd2.addSong(new Song("The List","4:34"));
        cd2.addSong(new Song("Redemption","7:03"));
        cd2.addSong(new Song("The Disciple","4:22"));
        cd2.addSong(new Song("Daughter of the Sun","4:07"));
        cd2.addSong(new Song("Legion of Lost Minds","4:54"));
        return cd2;
    }

    Cd buildCd3() {
        Cd cd3 = new Cd("Be'lakor", "The Frail Tide", 2007, 9, 6);
        cd3.addSong(new Song("Neither Shape Nor Shadow","7:40"));
        cd3.addSong(new Song("The Desolation of Ares","8:08"));
        cd3.addSong(new Song("Te'aste","5:41"));
        cd3.addSong(new Song("A Natural Apostasy","6:38"));
        cd3.addSong(new Song("Paths","6:03"));
        cd3.addSong(new Song("Sanguinary","8:40"));
        return cd3;
    }

    Cd buildCd4() {
        Cd cd4 = new Cd("Eternal Tears of Sorrow", "Children of the Dark Waters", 2009, 7, 9);
        cd4.addSong(new Song("Angelheart Ravenheart (Act II: Children of the Dark Waters)","6:00"));
        cd4.addSong(new Song("Baptized by the Blood of Angels","4:21"));
        cd4.addSong(new Song("Tears of Autumn Rain","4:13"));
        cd4.addSong(new Song("Summon the Wild","4:28"));
        cd4.addSong(new Song("Sea of Whispers","4:14"));
        cd4.addSong(new Song("Midnight Bird","4:46"));
        cd4.addSong(new Song("Diary of Demonic Dreams","4:25"));
        cd4.addSong(new Song("When the Darkest Night Falls","2:32"));
        cd4.addSong(new Song("Nocturne Thule","5:16"));
        return cd4;
    }
}
