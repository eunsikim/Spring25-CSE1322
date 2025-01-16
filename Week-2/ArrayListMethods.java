import java.util.ArrayList;

public class ArrayListMethods {
    public static void print(ArrayList<Float> list){
        System.out.println("Printing ArrayList:");
        for(Float element: list){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Float> GPA = new ArrayList<>();

        // Adds 3.5 to the ArrayList
        GPA.add(3.5f);
        print(GPA);

        // Add 4.0 at index 0
        GPA.add(0, 4.0f);
        print(GPA);
        
        // Checks if the ArrayList contains a 2.0 GPA
        System.out.println(GPA.contains(2.0f) + "\n");

        // Returns the element at index 1
        System.out.println(GPA.get(1) + "\n");

        // Returns how many elements are in the ArrayList
        System.out.println(GPA.size() + "\n");

        // Replaces the second element with 3.0
        GPA.set(1, 3.0f);
        print(GPA);

        // Removes the element at index 1
        GPA.remove(1);
        print(GPA);

        // Removes the element with the value 4.0
        GPA.remove(4.0f);
        print(GPA);
    }
}
