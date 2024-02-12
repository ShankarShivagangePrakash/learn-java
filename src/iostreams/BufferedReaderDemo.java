package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        BufferedReader bufferedReader = null;

        // text file location.
        String textFileLocation = System.getProperty("user.dir")+ "/src/resources/";

        fr = new FileReader(textFileLocation + "MyFile.txt");
        bufferedReader = new BufferedReader(fr);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        fr.close();
        bufferedReader.close();

    }
}
