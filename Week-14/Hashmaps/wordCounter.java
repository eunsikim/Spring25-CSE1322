import java.util.HashMap;

public class wordCounter {
    public static void main(String[] args) {
        String word = "BananaBananaBananaBananaBananaBananaBanana";    
        word = word.toLowerCase();

        HashMap<Character, Integer> found = new HashMap<>();

        int counter = 1;

        for(char c : word.toCharArray()){
            if(found.containsKey(c)){
                found.put(c, found.get(c) + 1);
            }
            else{
                found.put(c, 1);
            }
            System.out.println("Operation #" + counter++);
        }

        for(char c : found.keySet()){
            System.out.println("Letter " + c + ": " + found.get(c));
        }
    }
}
