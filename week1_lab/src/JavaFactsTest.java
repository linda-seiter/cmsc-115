import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFactsTest {

    @Test
    @DisplayName("JavaFacts.main prints correct output")
    public void mainIOTest() {
        String expected = "Java was initially named Oak.\n"
        		+ "Java is an object-oriented language.";
        String actual = TestUtility.getOutput("JavaFacts", null);
        assertEquals(expected, actual);
    }

}

