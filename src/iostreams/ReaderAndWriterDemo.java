package iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        // text file location.
        String textFileLocation = System.getProperty("user.dir")+ "/src/resources/";


        //For reading text data from a file.
        fileReader = new FileReader(textFileLocation + "MyFile.txt");

        //for writing contents to a file.
        fileWriter = new FileWriter(textFileLocation + "outputFile.txt");

        int ch;
        while ((ch = fileReader.read()) != -1){
            //writing data to output stream
            fileWriter.write(ch);
        }

        fileReader.close();
        fileWriter.close();

        System.out.println("program execution completed.");

    }
}
