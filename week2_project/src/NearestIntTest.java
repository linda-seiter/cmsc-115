import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearestIntTest {

    @Test
    @DisplayName("NearestInt.main prints correct output for input: 19 4")
    public void mainIOTest1() {
    	String input = "19 4";
        String expected = "Enter numerator and denominator: "
        		+ "Fraction: 19/4\n"
        		+ "Double Value: 4.75\n"
        		+ "Cast as Int: 4\n"
        		+ "Rounded to nearest int: 5\n"
        		+ "Negative Value: -4.75\n"
        		+ "Negative Value rounded to nearest int: -5";
        String actual = JunitHelper.mainInputOutput("NearestInt", input);
        assertEquals(expected, actual);
    }
    
    
    @Test
    @DisplayName("NearestInt.main prints correct output for input: 11 8")
    public void mainIOTest2() {
    	String input = "11 8";
        String expected = "Enter numerator and denominator: "
        		+ "Fraction: 11/8\n"
        		+ "Double Value: 1.375\n"
        		+ "Cast as Int: 1\n"
        		+ "Rounded to nearest int: 1\n"
        		+ "Negative Value: -1.375\n"
        		+ "Negative Value rounded to nearest int: -1";
        String actual = JunitHelper.mainInputOutput("NearestInt", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("NearestInt.main prints correct output for input: 7 10")
    public void mainIOTest3() {
    	String input = "7 10";
        String expected = "Enter numerator and denominator: "
        		+ "Fraction: 7/10\n"
        		+ "Double Value: 0.7\n"
        		+ "Cast as Int: 0\n"
        		+ "Rounded to nearest int: 1\n"
        		+ "Negative Value: -0.7\n"
        		+ "Negative Value rounded to nearest int: -1";
        String actual = JunitHelper.mainInputOutput("NearestInt", input);
        assertEquals(expected, actual);
    }
    
}

