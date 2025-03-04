public class SumArrayEx {
    public static int sumArray(int[] numbers, int index){
        if(numbers.length == index){
            return 0;
        }

        return sumArray(numbers, index + 1) + numbers[index];
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{3, 4, 1, 5, 6}, 0));
    }
}
