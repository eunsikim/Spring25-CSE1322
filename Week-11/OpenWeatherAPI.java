import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OpenWeatherAPI {
    public static void main(String[] args) {
        final String HOST = "api.openweathermap.org";
        final int PORT = 80;
        final String CITY = "Atlanta";
        final String API_KEY = "5d234983a5ac5e5ebe731ecbacbabd8c";  //a761744210dface291fb03c42021baad
        final String REQUEST_PATH = "/data/2.5/weather?q=" + CITY + "&appid=" + API_KEY + "&units=imperial";

        try (
            Socket socket = new Socket(HOST, PORT);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(socket.getInputStream());
        ){
            pw.println("GET " + REQUEST_PATH + " HTTP/1.1");
            pw.println("Host: " + HOST);
            pw.println("Connection: close");
            pw.println("");
            pw.flush();

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
