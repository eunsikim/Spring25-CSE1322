public class ArraysComparing {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};

        // Check if arrays have different lengths
        if(array1.length != array2.length){
            System.out.println("Arrays are not equal");
        }
        else{
            // Check if arrays have different elements
            for(int i = 0; i < array1.length; i++){
                if(array1[i] != array2[i]){
                    System.out.println("Arrays are not equal");
                    return;
                }
            }
            System.out.println("Arrays are equal");
        }


    }
}
