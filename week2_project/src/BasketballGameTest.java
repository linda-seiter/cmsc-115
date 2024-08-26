import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketballGameTest {
	
	public static String classContents;
	
	@BeforeAll
	public static void getClassContents() {
		classContents = JunitHelper.getClassAsString("BasketballGame");
	}

    @Test
    @DisplayName("BasketballGame.main prints correct output for input: 25 20")
    public void mainIOTest1() {
    	String input = "25 20";
        String expected = "Home and away points for 1st quarter: "
        		+ "1st quarter scores: home 25 away 20\n"
        		+ "2nd quarter scores: home 50 away 50\n"
        		+ "After challenge: home 47 away 50\n"
        		+ "3rd quarter scores: home 57 away 62\n"
        		+ "After challenge: home 58 away 62\n"
        		+ "4th quarter scores: home 82 away 81";
        String actual = JunitHelper.mainInputOutput("BasketballGame", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("BasketballGame.main prints correct output for input: 30 22")
    public void mainIOTest2() {
    	String input = "30 22";
        String expected = "Home and away points for 1st quarter: "
        		+ "1st quarter scores: home 30 away 22\n"
        		+ "2nd quarter scores: home 60 away 60\n"
        		+ "After challenge: home 57 away 60\n"
        		+ "3rd quarter scores: home 67 away 72\n"
        		+ "After challenge: home 68 away 72\n"
        		+ "4th quarter scores: home 97 away 96";
        String actual = JunitHelper.mainInputOutput("BasketballGame", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("BasketballGame.main ++ operator used once")
    public void incrementOperator() {
    	String pattern = "\\+\\+";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("BasketballGame", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    
    @Test
    @DisplayName("BasketballGame.main -- operator used once")
    public void decrementOperator() {
    	String pattern = "\\-\\-";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("BasketballGame", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    
    @Test
    @DisplayName("BasketballGame.main += operator used twice")
    public void additionAssignmentOperator() {
    	String pattern = "\\+\\=";
    	int expectedCount = 2;
    	int actualCount = JunitHelper.countOccurrences("BasketballGame", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    
    @Test
    @DisplayName("BasketballGame.main -= operator used once")
    public void subtractionAssignmentOperator() {
    	String pattern = "\\-\\=";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("BasketballGame", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    
    @Test
    @DisplayName("BasketballGame.main *= operator used once")
    public void multiplicationAssignmentOperator() {
    	String pattern = "\\*\\=";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("BasketballGame", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    
    
}
    
    


