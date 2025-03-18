import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFileEx1 {
    public static void main(String[] args) {
        File myFile;

        PrintWriter pw = null;

        try{
            myFile = new File("output.txt");
            pw = new PrintWriter(myFile);
            
            pw.println("Bob was here");
            pw.println("and he is angry");
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
