import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferEx1 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        String[] text = {"Hello", "World", "This is", "Just a test"};

        try(PrintWriter pw = new PrintWriter(file)){
           
            for(String s : text){
                pw.println(s);
                pw.flush();
                Thread.sleep(1000);
            }

            System.out.println("\nFinished writing file.");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        int[] numbs = {65, 65, 65, 65, 65, 65, 65, 65};
        try(FileOutputStream fos = new FileOutputStream(file)){
            for(int n: numbs){
                fos.write(n);
                Thread.sleep(1000);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
