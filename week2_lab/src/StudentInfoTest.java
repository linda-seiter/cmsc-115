import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentInfoTest {

    @Test
    @DisplayName("StudentInfo.main prints correct output")
    public void mainIOTest() {
    	String expected = "Age: 28 gpa: 3.8\n"
    			+ "Age: 29 gpa: 4.0";
        String actual = TestUtility.getOutput("StudentInfo", null);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("StudentInfo.main declares gpa once")
    public void mainDeclarationTest() {
    	String contents = TestUtility.getClassAsString("StudentInfo");
		System.out.println(contents);
		
		Pattern pattern = Pattern.compile("double gpa");
	    Matcher matcher = pattern.matcher(contents);
	    int count = 0;
	    while (matcher.find()) {
	    	count++;
	    }
	    assertEquals(1, count);
    }
    

}

