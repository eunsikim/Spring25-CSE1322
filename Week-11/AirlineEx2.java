import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AirlineEx2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("source.csv"))) {
            String dataline;

            while (sc.hasNextLine()) {
                dataline = sc.nextLine();
                String[] tokens = dataline.split(","); 

                for(String s : tokens){
                    System.out.print(s + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
