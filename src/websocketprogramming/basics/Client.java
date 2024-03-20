package websocketprogramming.basics;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        // It will create server listening to port 8080
        try (
                // specify the server port with which you need to establish connection.
                Socket socket = new Socket("localhost", 8080);

                // we need to send some request to server. To do that use outputStream
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             )
        {
            dataOutputStream.writeUTF("Hello, this is introduction to web socket programming");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
