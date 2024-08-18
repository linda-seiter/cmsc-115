import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentsTest {

    @Test
    @DisplayName("Comments.main prints correct output")
    public void mainIOTest() {
        String expected = "apple\n"
        		+ "pear\n"
        		+ "watermelon"; 
        String actual = TestUtility.getOutput("Comments", null);
        assertEquals(expected, actual);
    }

}

