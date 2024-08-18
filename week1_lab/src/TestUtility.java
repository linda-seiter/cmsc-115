import java.io.PrintStream;
/**
 * TestUtility class provides a utility method for Junit I/O tests 
 * @author First Last
 */
import java.lang.reflect.Method;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class TestUtility {
	private static PrintStream standardOut = System.out;
	private static InputStream standardIn = System.in;

	/**
	 * @param className - The class to execute
	 * @param input - The user input
	 * @return The main method output
	 */
	public static String getOutput(String className, String input) {
		ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
		if (input != null)
			System.setIn(new ByteArrayInputStream(input.getBytes()));
		System.setOut(new PrintStream(outputStreamCaptor));
		try {
			final Class<?> clazz = Class.forName(className);
			final Method main = clazz.getMethod("main", String[].class);
			final Object[] args = new Object[1];
			args[0] = new String[] {};
			main.invoke(null, args);
		} catch (Exception e) { e.printStackTrace();}
		System.setIn(standardIn);
		System.setOut(standardOut);
		return outputStreamCaptor.toString().trim();
	} 

}
