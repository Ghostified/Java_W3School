import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    //Regular Expressions = a sequence that forms a pattern
    //they can be used for text search and text replace operations
    //the java.util.regex  package is used with the following classes :
    //1. Pattern class  = defines a pattern to be used in search
    //2. Matcher class = used to search for a pattern
    //3.patternSyntaxException class = indicates synatx erroer in a regular expression pattern

    //Example
    //find the pattern Branson in a sentence

    public static void main (String [] Args ) {

        //create a pattern with the Patter.compile () method, 
        Pattern pattern = Pattern.compile("Branson", Pattern.CASE_INSENSITIVE);

        //use Matcher() used to find a pattern in a string
        Matcher match = pattern.matcher("Hello Branson ");

        //.find () returns true if match is found
        boolean matchFound = match.find();
        if (matchFound) {
            System.out.println("Match found");
        }
        else {
            System.out.println("Pattern not found");
        }

        //
        
    }
}
