package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceBlock {

    public static void main(String[] args) throws IOException {

        String textFileLocation = System.getProperty("user.dir")+ "/src/resources/";

        //resources are created inside try block, so JVM take care of closing the resources,
        try (FileReader fr =new FileReader(textFileLocation + "MyFile.txt");
             BufferedReader bufferedReader = new BufferedReader(fr);) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }
    }
}
