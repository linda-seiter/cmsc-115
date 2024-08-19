import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DebugItTest {

    @Test
    @DisplayName("DebugIt.main prints correct output")
    public void mainIOTest() {
        String expected = "Planes on runway = 4";
        String actual = TestUtility.getOutput("DebugIt", null);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("DebugIt.main uses augmented addition operator twice")
    public void mainAddOpTest() {
    	String contents = TestUtility.getClassAsString("DebugIt");
		System.out.println(contents);
		
		Pattern pattern = Pattern.compile("\\+=");
	    Matcher matcher = pattern.matcher(contents);
	    int count = 0;
	    while (matcher.find()) {
	    	count++;
	    }
	    assertEquals(1, count);
    }
    
    @Test
    @DisplayName("DebugIt.main uses augmented subtraction operator twice")
    public void mainSubOpTest() {
    	String contents = TestUtility.getClassAsString("DebugIt");
		System.out.println(contents);
		
		Pattern pattern = Pattern.compile("\\-=");
	    Matcher matcher = pattern.matcher(contents);
	    int count = 0;
	    while (matcher.find()) {
	    	count++;
	    }
	    assertEquals(1, count);
    }

}

