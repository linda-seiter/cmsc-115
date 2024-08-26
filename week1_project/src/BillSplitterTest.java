import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BillSplitterTest {

	@Test
	@DisplayName("BillSplitter.main prints correct output")
	public void mainIOTest() {
		String expectedOutput = "56.52";
		String actualOutput = JunitHelper.mainOutput("BillSplitter");
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
    @DisplayName("BillSplitter.main formula contains multiplication, addition, then division")
    public void formulaOperatorTest() {
    	String pattern = "\\*.*\\+.*/";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("BillSplitter", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }

}

