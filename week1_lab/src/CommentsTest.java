import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentsTest {

    @Test
    @DisplayName("Comments.main prints correct output")
    public void mainIOTest() {
    	String expectedOutput = "apple\n"
        		+ "pear\n"
        		+ "watermelon"; 
        String actualOutput = JunitHelper.mainOutput("Comments");
        assertEquals(expectedOutput, actualOutput);
    }

}

