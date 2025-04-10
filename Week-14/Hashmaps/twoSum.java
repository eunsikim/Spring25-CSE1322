import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        // Key: Value in Array, Value: Index of that value
        HashMap<Integer, Integer> found = new HashMap<>();

        int[] nums = new int[] {11, 7, 200, 15, 32 , 99, 100, 150, 2};
        int target = 9;

        int[] result = null;

        int op = 1;

        for(int i = 0; i < nums.length; i++){
            int sub = target - nums[i];

            if(found.containsKey(sub)){
                result = new int[] {i, found.get(sub)};
                break;
            }
            else{
                found.put(nums[i], i);
            }

            System.out.println("Operation #" + op++);
        }

        System.out.print("[ ");
        for(int index : result){
            System.out.print(index + ", ");
        }
        System.out.println(" ]");
    }
}
