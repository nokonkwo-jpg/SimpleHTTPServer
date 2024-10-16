import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class SimpleHTTPServer {

    public static void main(String args[] ) throws Exception {
        // Create a ServerSocket that listens for connections on port 8080
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");

        // Infinite loop to keep the server running and listening for client connections
        while (true) {
            // Wait for a client to connect and create a socket for communication
            try(Socket clientSocket = server.accept()){

                // Get the current date and time
                Date date = new Date();

                // Create an HTTP response with status 200 (OK) and the current date in the body
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + date;

                // Send the HTTP response back to the client
                clientSocket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}