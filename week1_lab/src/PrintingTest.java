import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintingTest {

    @Test
    @DisplayName("Printing.main prints correct output")
    public void mainIOTest() {
        String expected = "red \n"
        		+ "green blue \n"
        		+ "pink \n"
        		+ "yellow";
        String actual = TestUtility.getOutput("Printing", null);
        assertEquals(expected, actual);
    }

}

