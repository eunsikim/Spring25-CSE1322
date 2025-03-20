import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingBinaryEx1 {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        try(
            FileOutputStream fout = new FileOutputStream(file); 
            FileInputStream fis = new FileInputStream(file)
        ){
            System.out.println("Writing to file...");
            fout.write(65);
            System.out.println("Finished writing to file...");
            System.out.println("Reading file as binary...");

            int byteValue = fis.read();
            System.out.printf("Byte Value: %d\n", byteValue);
            System.out.printf("Hex: %02X\n", byteValue);
            System.out.printf("Binary: %8s\n", Integer.toBinaryString(byteValue));
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
