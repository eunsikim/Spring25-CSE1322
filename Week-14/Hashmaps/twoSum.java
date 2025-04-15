import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {11, 7, 15, 2};
        int target = 9;

        int[] result = new int[2];

        // KEY: value in nums[], VALUE: index of value in nums[]
        HashMap<Integer, Integer> found = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int sub = target - nums[i];

            if(found.containsKey(sub)){
                result[0] = i;
                result[1] = found.get(sub);
            }
            else{
                found.put(nums[i], i);
            }
        }

        for(int index : result){
            System.out.println(index);
        }
    }
}
