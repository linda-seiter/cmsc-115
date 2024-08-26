import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelfIntroductionTest {

    @Test
    @DisplayName("SelfIntroduction.main prints at least 4 lines of output")
    public void mainIOTest() {
        String actualOutput = JunitHelper.mainOutput("SelfIntroduction");
        String[] lines = actualOutput.split("\n");
        assertTrue(lines.length >= 4, "At least 4 lines of output");
    }

}

