public class ArraysPrinting {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for(int number : array){
            System.out.println(number);
        }
    }
}
