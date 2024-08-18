import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaSharesTest {

    @Test
    @DisplayName("PizzaShares.main prints correct output for input: 4 12")
    public void mainIOTest1() {
    	String input = "4 12";
        String expected = "Enter #people and #slices: "
        		+ "Each person gets 3 slices.\n"
        		+ "There are 0 slices remaining.";
        String actual = TestUtility.getOutput("PizzaShares", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("PizzaShares.main prints correct output for input: 7 16")
    public void mainIOTest2() {
    	String input = "7 16";
        String expected = "Enter #people and #slices: "
        		+ "Each person gets 2 slices.\n"
        		+ "There are 2 slices remaining.";
        String actual = TestUtility.getOutput("PizzaShares", input);
        assertEquals(expected, actual);
    }
    
}

