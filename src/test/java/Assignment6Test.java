import Collections.CD.Types.Cd;
import Collections.CD.Types.Song;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Assignment6Test {

    @Test
    void cd_addSong_addsSongToCd(){
        //GIVEN
        Song newSong = new Song("Sicko Mode", "3:14");
        Cd cd = new Cd("Astroworld", "Travis Scott", 2018, 10, 0);

        //WHEN
        cd.addSong(newSong);

        //THEN
        assertTrue(cd.getSongs().contains(newSong), "Expected Sicko Mode to be included in the new CD!");
    }

    @Test
    void cd_songs_isArrayList(){
        //GIVEN
        Cd cd = new Cd("Astroworld", "Travis Scott", 2018, 10, 2);

        //THEN
        assertInstanceOf(ArrayList.class, cd.getSongs(), "Expected the list of songs to be of type ArrayList!");
    }
}
