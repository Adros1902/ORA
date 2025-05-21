package compiler;

import grammar.ORALexer;
import grammar.ORAParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.FileWriter;
import java.io.IOException;

public class StartCompiler {
    public static void main(String[] args) {
        CharStream inp = null;

        try {
            inp = CharStreams.fromFileName("we.first");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        CharStream inp = CharStreams.fromString("1\n2+3+4","wejście");
        ORALexer lex = new ORALexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ORAParser par = new ORAParser(tokens);

        //ParseTree tree = par.prog(); ********

        //st group
//        STGroup.trackCreationEvents = true;
        STGroup group = new STGroupFile("src/compiler/sql.stg");

        EmitVisitor em = new EmitVisitor();
        ParseTree tree = par.query();
        String res = em.visit(tree);
        System.out.println(res);
        try {
            var wr = new FileWriter("wy.sql");
            wr.write(res);
            wr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        res.inspect();
    }
}
