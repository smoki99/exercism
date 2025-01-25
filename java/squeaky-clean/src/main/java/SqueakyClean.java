import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(' ', '_');
        if (identifier.contains("-")) {
            identifier = kebabToCamelCase(identifier);
        }
        
        identifier = identifier.replace('4', 'a');
        identifier = identifier.replace('3', 'e');
        identifier = identifier.replace('0', 'o');
        identifier = identifier.replace('7', 't');
        identifier = identifier.replace('1', 'l');
        identifier = removeAllCharactersButNotLetters(identifier);
        
        return identifier;
    }

    private static String removeAllCharactersButNotLetters(String identifier) {
        return identifier.replaceAll("[^a-zA-Z_]", "");
    }

    private static String kebabToCamelCase(String kebabCaseString) {
       Pattern pattern = Pattern.compile("-([a-z])");
       Matcher matcher = pattern.matcher(kebabCaseString);
       StringBuffer sb = new StringBuffer();

       while (matcher.find()) {
           matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
       }
       matcher.appendTail(sb);

       return sb.toString().replace("-", "");
    }
}
