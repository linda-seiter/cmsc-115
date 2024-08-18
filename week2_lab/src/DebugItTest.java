import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebugItTest {

    @Test
    @DisplayName("DebugIt.main prints correct output")
    public void mainIOTest() {
        String expected = "Planes on runway = 7\n"
        		+ "Ships in port = 6";
        String actual = TestUtility.getOutput("DebugIt", null);
        assertEquals(expected, actual);
    }

}

