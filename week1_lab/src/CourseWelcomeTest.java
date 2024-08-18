import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseWelcomeTest {

    @Test
    @DisplayName("CourseWelcome.main prints correct output")
    public void mainIOTest() {
        String expected = "Welcome to CMCS 115.\n" +
                "Let's learn Java!";
        String actual = TestUtility.getOutput("CourseWelcome", null);
        assertEquals(expected, actual);
    }

}

