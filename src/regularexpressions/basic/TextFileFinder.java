package regularexpressions.basic;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {
    public static void main(String[] args) {

        File directory = new File(System.getProperty("user.dir") + "/src/resources/regexfilesdirectory");
        String[] fileNames = directory.list();

        // we should list file names of the form any alphanumeric character.txt
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.]txt");

        for (String fileName : fileNames) {
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.matches()) {
                System.out.println("Pattern matching file " + fileName);
            }
        }
    }
}
