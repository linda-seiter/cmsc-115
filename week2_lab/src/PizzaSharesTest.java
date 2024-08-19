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
        String expected = "Enter #slices and #people: "
        		+ "Each person gets 2 slices.\n"
        		+ "There are 4 slices remaining.";
        String actual = TestUtility.getOutput("PizzaShares", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("PizzaShares.main prints correct output for input: 12 4")
    public void mainIOTest2() {
    	String input = "12 4";
        String expected = "Enter #slices and #people: "
        		+ "Each person gets 3 slices.\n"
        		+ "There are 0 slices remaining.";
        String actual = TestUtility.getOutput("PizzaShares", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("PizzaShares.main uses remainder operator")
    public void modOperatorTest() {
    	String contents = TestUtility.getClassAsString("PizzaShares");
		System.out.println(contents);
		
		Pattern pattern = Pattern.compile("totalSlices\\s+%\\s+people");
	    Matcher matcher = pattern.matcher(contents);
	    int count = 0;
	    while (matcher.find()) {
	    	count++;
	    }
	    assertEquals(1, count);
    }
    
}

