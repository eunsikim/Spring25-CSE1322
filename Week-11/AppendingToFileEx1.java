import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendingToFileEx1 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try{
            File myFile = new File("output.txt");
            FileOutputStream fos = new FileOutputStream(myFile, true);
            pw = new PrintWriter(fos);

            pw.println("Test Line");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(pw != null){
                pw.close();
            }
        }
    }
}
