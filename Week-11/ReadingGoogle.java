import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ReadingGoogle {
    public static void main(String[] args) {
        try(
            Socket mySock = new Socket("www.google.com", 80);
            PrintWriter pw = new PrintWriter(mySock.getOutputStream(), true);
            Scanner sc = new Scanner(mySock.getInputStream())
        ){
            String dataline = "";

            pw.println("GET /index.html\n\n");

            pw.flush();

            while(sc.hasNextLine()){
                dataline = sc.nextLine();
                System.out.println(dataline);
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
