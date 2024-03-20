package websocketprogramming.chatapp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {

    public static void main(String[] args) {

        try (
                Socket socket = new Socket("localhost", 8080);

                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

                // we need both input and output stream to read and write data to console.
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ) {

            String messageToSend = "";

            // we keep communicating till client enters text as "exit"
            while (true) {
                messageToSend = bufferedReader.readLine();

                if ("exit".equalsIgnoreCase(messageToSend)) {
                    break;
                }
                dataOutputStream.writeUTF(messageToSend);
                dataOutputStream.flush();

                System.out.println("Server says: " + dataInputStream.readUTF() );
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
