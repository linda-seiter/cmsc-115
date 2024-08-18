import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelfIntroductionTest {

    @Test
    @DisplayName("SelfIntroduction.main prints at least 4 lines of output")
    public void mainIOTest() {
        String actual = TestUtility.getOutput("SelfIntroduction", null);
        String[] lines = actual.split("\n");
        assertTrue(lines.length >= 4, "At least 4 lines of output");
    }

}

