import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaycheckTest {

    @Test
    @DisplayName("Paycheck.main prints correct output")
    public void mainIOTest() {
    	String expectedOutput = "Week#1 hours: 35 rate: $18.25 pay: $638.75\n"
        		+ "Week#2 hours: 39 rate: $18.25 pay: $711.75\n"
        		+ "Week#3 hours: 27 rate: $18.75 pay: $506.25";
        String actualOutput = JunitHelper.mainOutput("Paycheck");
        assertEquals(expectedOutput, actualOutput);
    }

}

