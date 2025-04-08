import java.util.TreeMap;

public class BuiltIn_BST_Ex1 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> myTree = new TreeMap<>();

        int[] arr = {15, 25, 8, 4, 10, 30, 20, 6, 2, 12, 17, 36, 24, 9, 28};

        for(int num : arr){
            myTree.put(num, num);
        }

        System.out.println();

        System.out.println(myTree);

        myTree.remove(15);
        
        System.out.println(myTree);
    }    
}
