import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseWelcomeTest {

    @Test
    @DisplayName("CourseWelcome.main prints correct output")
    public void mainIOTest() {
    	String expectedOutput = "Welcome to CMCS 115.\n" +
                "Let's learn Java!";
        String actualOutput = JunitHelper.mainOutput("CourseWelcome");
        assertEquals(expectedOutput, actualOutput);
    }

}

