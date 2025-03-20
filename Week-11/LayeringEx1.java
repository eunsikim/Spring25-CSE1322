import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LayeringEx1 {
    public static void main(String[] args) {
        File file = new File("source.csv");

        try (FileInputStream fis = new FileInputStream(file)) {
            System.out.println("FileInputStream (Raw Bytes as hex values):");
            int byteValue;
            while ((byteValue = fis.read()) != -1) {
                System.out.printf("%02X ", byteValue);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--------------------------------------");

        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis)) {
            System.out.println("InputStreamReader (Characters):");
            int charValue;
            while ((charValue = isr.read()) != -1) {
                System.out.print((char) charValue);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--------------------------------------");

        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            System.out.println("BufferedReader (Lines):");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}