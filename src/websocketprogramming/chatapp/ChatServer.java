package websocketprogramming.chatapp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String[] args) throws IOException {

        try (
                ServerSocket serverSocket = new ServerSocket(8080);
                Socket socket = serverSocket.accept();

                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

                // we need both input and output stream to read and write data to console.
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ) {

            String messageReceived = "", messageToSend = "";

            // we keep communicating till client enters text as "exit"
            while (true) {

                messageReceived = dataInputStream.readUTF();
                System.out.println("Client says: " + messageReceived);

                if ("exit".equalsIgnoreCase(messageReceived)) {
                    break;
                }

                // we need to send client, what we type on server console.
                messageToSend = bufferedReader.readLine();
                dataOutputStream.writeUTF(messageToSend);
                dataOutputStream.flush();
            }

        }
    }
}
