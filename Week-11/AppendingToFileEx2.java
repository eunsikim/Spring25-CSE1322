import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendingToFileEx2 {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File("output.txt"), true))){
            pw.write("Test Line");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
