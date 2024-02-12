package iostreams;

import java.io.*;

public class FileOutputStreamsDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        // text file location.
        String textFileLocation = System.getProperty("user.dir")+ "/src/resources/";

        try {
            fis = new FileInputStream(textFileLocation + "MyFile.txt");

            //fos will create new file and writes content to it.
            fos = new FileOutputStream(textFileLocation + "outputFile.txt");

            System.out.println("reading contents of the file");
            int i;
            while ((i = fis.read()) != -1){
                //writing data to output stream
                fos.write(i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {

            //close the resource after usage.
                fis.close();
                fos.close();
            System.out.println("\nResource closed");
        }
    }
}
