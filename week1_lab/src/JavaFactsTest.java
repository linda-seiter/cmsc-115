import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFactsTest {

    @Test
    @DisplayName("JavaFacts.main prints correct output")
    public void mainIOTest() {
    	String expectedOutput = "Java was initially named Oak.\n"
        		+ "Java is an object-oriented language.";
        String actualOutput = JunitHelper.mainOutput("JavaFacts");
        assertEquals(expectedOutput, actualOutput);
    }

}

