import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class TesteAlguma {

    public static void main(String[] args) {
        String fileName= args[0];
        AlgumaParser parser = getParser(fileName);
        ParseTree ast = parser.programa();

        AlgumaSemanticParser visitante = new AlgumaSemanticParser();
        visitante.visit(ast);
        // System.out.println("Teste");
    }

    private static AlgumaParser getParser(String fileName) {
        AlgumaParser parser = null;

        try{
            CharStream input = CharStreams.fromFileName(fileName);
            AlgumaLexer lexer = new AlgumaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new AlgumaParser(tokens);
	        System.out.println("If this is the only output line, the program was compile with success");
        } catch (IOException e){
            e.printStackTrace();
        }

        return parser;
    }
}
