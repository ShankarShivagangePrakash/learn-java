package websocketprogramming.basics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        // It will create server listening to port 8080
        try (
                // It will create server listening to port 8080
                ServerSocket serverSocket = new ServerSocket(8080);

                // accept the connection from client.
                Socket socket = serverSocket.accept();

                // we have to read the input from client
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
             ) {

            System.out.println("Data received at server end: " + inputStream.readUTF());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
