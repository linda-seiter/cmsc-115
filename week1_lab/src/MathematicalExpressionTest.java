import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathematicalExpressionTest {

    @Test
    @DisplayName("MathematicalExpression.main prints correct output")
    public void mainIOTest() {
        String expectedOutput = "(2 + 3) * 8 = 40";
        String actualOutput = JunitHelper.mainOutput("MathematicalExpression");
        assertEquals(expectedOutput, actualOutput);
    }

}

