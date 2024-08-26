import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PoemTest {

    @Test
    @DisplayName("Poem.main prints at least 8 lines of output")
    public void mainIOTest() {
        String actualOutput = JunitHelper.mainOutput("Poem");
        String[] lines = actualOutput.split("\n");
        assertTrue(lines.length >= 8, "At least 8 lines of output");
    }

}

