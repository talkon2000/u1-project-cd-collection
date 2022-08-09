import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Assignment2Test {

    /*@Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();*/
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void programCompiles() {
        CDDriver.main(new String[]{""});
    }

    @Test
    public void cdReader_reachesEndOfFile() {
        CDReader reader = new CDReader();
        reader.getAllCds("cds_short.txt");
        assertEquals("Reached end of file",outputStreamCaptor.toString().trim());
    }

    @Test
    public void cdReader_doesNotThrowException_returnsNull() {
        CDReader reader = new CDReader();
        assertNull(reader.getAllCds("cds_short.tx"));
    }

    @Test
    public void cdReader_outputsMessageInsteadOfExiting() {
        CDReader reader = new CDReader();
        reader.getAllCds("cds_short.tx");
        assertFalse(outputStreamCaptor.toString().isEmpty());
    }
}
