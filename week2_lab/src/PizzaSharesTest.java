import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PizzaSharesTest {

    
    @Test
    @DisplayName("PizzaShares.main prints correct output for input: 24 10")
    public void mainIOTest1() {
    	String input = "24 10";
        String expectedOutput = "Enter #slices and #people: "
        		+ "Each person gets 2 slices.\n"
        		+ "There are 4 slices remaining.";
        String actualOutput = JunitHelper.mainInputOutput("PizzaShares", input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    @DisplayName("PizzaShares.main prints correct output for input: 12 4")
    public void mainIOTest2() {
    	String input = "12 4";
        String expectedOutput = "Enter #slices and #people: "
        		+ "Each person gets 3 slices.\n"
        		+ "There are 0 slices remaining.";
        String actualOutput = JunitHelper.mainInputOutput("PizzaShares", input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    
    @Test
    @DisplayName("PizzaShares.main uses % once")
    public void modOperatorTest() {
    	String pattern = "%";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("PizzaShares", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    
}

