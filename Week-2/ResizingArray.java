import java.util.Scanner;

public class ResizingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        ages[0] = 21;
        ages[1] = 22;
        ages[2] = 23;

        System.out.println("ages has a capacity of " + ages.length);
        System.out.println("\nLet's increase it");
        System.out.print("\nWhat size should it be?: ");
        int newSize = sc.nextInt();

        int[] newAges = new int[newSize];
        System.out.println("\nCopying data into the new larger array\n");
        for(int i = 0; i < ages.length; i++){
            newAges[i] = ages[i];
        }

        ages = newAges;
        System.out.println("ages has a capacity of " + ages.length);
    }
}
