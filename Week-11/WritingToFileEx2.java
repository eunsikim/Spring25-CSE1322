import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFileEx2 {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter(new File("Output.txt"))){
            pw.println("Bob was here");
            pw.println("and he is angry");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
