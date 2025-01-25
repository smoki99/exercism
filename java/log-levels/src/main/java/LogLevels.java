import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class LogLevels {

    public static String message(String logLine) {
        List<String> results = parseInput(logLine);
        return results.get(1).trim();
    }

    public static String logLevel(String logLine) {
        List<String> results = parseInput(logLine);
        return results.get(0).trim();
    }

    public static String reformat(String logLine) {
        List<String> results = parseInput(logLine);
        return
            results.get(1).trim() 
            +" ("+results.get(0)+")";
    }

    static List<String> parseInput(String logLine) {
        List<String> results = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\[(.*?)\\]: (.*)");
        Matcher matcher = pattern.matcher(logLine);
         if (matcher.find()) {
            results.add(matcher.group(1).toLowerCase());
            results.add(matcher.group(2));
        }
        return results;
    }
}
