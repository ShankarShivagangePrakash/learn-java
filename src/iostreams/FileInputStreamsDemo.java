package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamsDemo {


    public static void main(String[] args){
        //get current project directory
        String currentDirectory = System.getProperty("user.dir");

        // text file location.
        String textFileLocation = currentDirectory + "/src/resources/" + "MyFile.txt";


        //File input streams for reading the data.
        FileInputStream fileInputStream = null;

        // now attach this file input stream to a file
        try {
            /* creating file input stream with file object is a popular method
             here we are not creating new file, rather new file is just a handle to the text file, like a pointer.
             creating file input stream object can throw a checked exception handle it.*/
            fileInputStream = new FileInputStream(new File(textFileLocation));

            /* if file input stream object is not null, you can read data
             let's read one bye at a type
             read till -1 is encountered, which represents the end of file (EOF)*/
            System.out.println("contents of the file");
            int i;
            while ((i = fileInputStream.read()) != -1){
                //convert the byte to character.
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            //close the resource after usage.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nResource closed");
        }
    }
}
