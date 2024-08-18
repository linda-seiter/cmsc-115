/**
 * TestUtility class provides a utility method for Junit I/O tests 
 * @author First Last
 */
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

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
    
    /**
     * @param className - The class to read as a file
     * @return The file contents as a String
     */
    public static String getClassAsString(String className) {
    	String userDirectory = System.getProperty("user.dir");
   	 	String filePath = userDirectory + "/src/"+className+".java";
		try {
			return new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
    } 
    
}
