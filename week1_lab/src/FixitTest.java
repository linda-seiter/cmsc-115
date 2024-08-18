import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FixitTest {

    @Test
    @DisplayName("Fixit.main prints correct output")
    public void mainIOTest() {
        String expected = "ship\n"
        		+ "airplane\n"
        		+ "tank";
        String actual = TestUtility.getOutput("Fixit", null);
        assertEquals(expected, actual);
    }

}

