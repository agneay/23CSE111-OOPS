import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345); // Listening on port 12345
        System.out.println("Server is running...");

        Socket clientSocket = serverSocket.accept(); // Accept client connection
        System.out.println("Client connected");

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String message = input.readLine();
        System.out.println("Client says: " + message);

        clientSocket.close();
        serverSocket.close();
    }
}
