import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathematicalExpressionTest {

    @Test
    @DisplayName("MathematicalExpression.main prints correct output")
    public void mainIOTest() {
        String expected = "(2 + 3) * 8 = 40";
        String actual = TestUtility.getOutput("MathematicalExpression", null);
        assertEquals(expected, actual);
    }

}

