import com.sun.source.util.JavacTask;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.Tree;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class PrintClassMethods {

    public static void main(final String[] args) throws Exception {
    	String fileName = "src/BasketballGame.java";
        final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try (final StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, StandardCharsets.UTF_8)) {
            final Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(new File(fileName)));
            final JavacTask javacTask = (JavacTask) compiler.getTask(null, fileManager, null, null, null, compilationUnits);
            final Iterable<? extends CompilationUnitTree> compilationUnitTrees = javacTask.parse();
            final ClassTree classTree = (ClassTree) compilationUnitTrees.iterator().next().getTypeDecls().get(0);
            final List<? extends Tree> classMemberList = classTree.getMembers();
            final List<MethodTree> classMethodMemberList = classMemberList.stream()
                .filter(MethodTree.class::isInstance)
                .map(MethodTree.class::cast)
                .collect(Collectors.toList());
            //prints the names of the methods
            //classMethodMemberList.stream().map(MethodTree::getName)
            //    .forEachOrdered(System.out::println);
            //print body
            //classMethodMemberList.stream().map(MethodTree::getBody)
            //.forEachOrdered(System.out::println);
            final List<MethodTree> matchingMethods = classMethodMemberList.stream().filter(m -> m.getName().toString().equals("main"))
            		.collect(Collectors.toList());
            System.out.println(matchingMethods.getFirst().getBody());
        }
    }

}