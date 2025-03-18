import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AirlineEx1 {
    public static void main(String[] args) {
        Scanner sc = null;

        try{
            String dataline = "";

            File myFile = new File("source.csv");

            sc = new Scanner(myFile);

            while(sc.hasNextLine()){
                dataline = sc.nextLine();

                String[] tokens = dataline.split(",");

                for(String s : tokens){
                    System.out.print(s + "\t");
                }
                System.out.println();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }
        }
    }
}
