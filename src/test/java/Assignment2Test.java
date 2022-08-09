import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class Assignment2Test {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Test
    public void programCompiles() {
        CDDriver.main(new String[]{""});
    }

    @Test
    public void cdReader_reachesEndOfFile() {
        CDReader reader = new CDReader();
        reader.getAllCds("cds_short.txt");
        assertEquals("Reached end of file\n",systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void cdReader_doesNotThrowException() {
        CDReader reader = new CDReader();
        reader.getAllCds("cds_short.tx");
    }

    @Test
    public void cdReader_outputsMessageInsteadOfExiting() {
        CDReader reader = new CDReader();
        assertNull(reader.getAllCds("cds_short.tx"));
        assertFalse(systemOutRule.getLog().isEmpty());
    }
}
