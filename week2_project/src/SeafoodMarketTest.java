import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeafoodMarketTest {

    @Test
    @DisplayName("SeafoodMarket.main prints correct output for input: 5 8.99")
    public void mainIOTest1() {
    	String input = "5 8.99";
        String expected = "Enter pounds of fish and price per pound: "
        		+ "5.0 lbs at $8.99 per lb = $44.95";
        String actual = JunitHelper.mainInputOutput("SeafoodMarket", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("SeafoodMarket.main prints correct output for input: 3.25 15.99")
    public void mainIOTest2() {
    	String input = "3.25 15.99";
        String expected = "Enter pounds of fish and price per pound: "
        		+ "3.25 lbs at $15.99 per lb = $51.97";
        String actual = JunitHelper.mainInputOutput("SeafoodMarket", input);
        assertEquals(expected, actual);
    }

}

