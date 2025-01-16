import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            numbers.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < numbers.size(); i++){
            System.out.println("index " + i + ": " + numbers.get(i));
        }
    }
}
