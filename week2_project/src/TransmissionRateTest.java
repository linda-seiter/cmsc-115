import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransmissionRateTest {
	
	public static String classContents;
	
	@BeforeAll
	public static void getClassContents() {
		classContents = TestUtility.getClassAsString("TransmissionRate");
	}

    @Test
    @DisplayName("TransmissionRate.main prints correct output for input: 2")
    public void commonCold() {
    	String input = "2";
        String expected = "Enter r0: "
        		+ "New cases on 4th iteration: 16";
        String actual = TestUtility.getOutput("TransmissionRate", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("TransmissionRate.main prints correct output for input: 10")
    public void chickenPox() {
    	String input = "10";
        String expected = "Enter r0: "
        		+ "New cases on 4th iteration: 10000";
        String actual = TestUtility.getOutput("TransmissionRate", input);
        assertEquals(expected, actual);
    }
   
    
    @Test
    @DisplayName("TransmissionRate.main prints correct output for input: 18")
    public void measles() {
    	String input = "18";
        String expected = "Enter r0: "
        		+ "New cases on 4th iteration: 104976";
        String actual = TestUtility.getOutput("TransmissionRate", input);
        assertEquals(expected, actual);
    }
    
    
    @Test
    @DisplayName("TransmissionRate.main calls Math.pow")
    public void mathpow() {
    	Pattern pattern = Pattern.compile("Math[.]pow\\(.*?\\)");
	    Matcher matcher = pattern.matcher(classContents);
	    int count = 0;
	    while (matcher.find()) {
	    	count++;
	    }
	    assertEquals(1, count);
    }
    
    @Test
    @DisplayName("TransmissionRate int cast")
    public void intcast() {
    	Pattern pattern = Pattern.compile("\\(int\\)");
	    Matcher matcher = pattern.matcher(classContents);
	    int count = 0;
	    while (matcher.find()) {
	    	count++;
	    }
	    assertEquals(1, count);
    }
    
}
    
    


