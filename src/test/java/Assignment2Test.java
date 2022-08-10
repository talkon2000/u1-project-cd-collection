import Libraries.CD.CDDriver;
import Libraries.CD.CDReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Assignment2Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void programCompiles() {
        new CDDriver("cds_short.csv").getLibrary();
    }

    @Test
    public void cdReader_reachesEndOfFile() {
        CDReader reader = new CDReader();
        reader.getAllCds("cds_short.csv");
        assertEquals("Reached end of file",outputStreamCaptor.toString().trim());
    }

    @Test
    public void cdReader_doesNotThrowException_returnsNull() {
        CDReader reader = new CDReader();
        assertNull(reader.getAllCds("cds_sh.csv"));
    }

    @Test
    public void cdReader_outputsMessageInsteadOfExiting() {
        CDReader reader = new CDReader();
        reader.getAllCds("cds_sh.csv");
        assertFalse(outputStreamCaptor.toString().isEmpty());
    }
}
