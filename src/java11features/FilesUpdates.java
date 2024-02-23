package java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdates {

    public static void main(String[] args) throws IOException {

        String tempFileLocation = System.getProperty("user.dir")+ "/src/resources/tempfiles/";
        // To this location, we will create a temp file, temp file means, it will use the prefix and suffix(extension) we specify
        // but to filename it will append random characters,
        Path filePath = Files.createTempFile(Path.of(tempFileLocation), "test", ".txt");

        // writing to a temp file.
        Files.writeString(filePath, "Java 11 is cool");
        // reading from temp file.
        System.out.println(Files.readString(filePath));
    }
}
