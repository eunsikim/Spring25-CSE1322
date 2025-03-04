public class SumArrayEx {
    private static int sumArray(int[] numbers, int index){
        if(numbers.length == index){
            return 0;
        }

        return sumArray(numbers, index + 1) + numbers[index];
    }

    public static int sumArray(int[] numbers){
        return sumArray(numbers, 0);
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{3, 4, 1, 5, 6}));
    }
}
