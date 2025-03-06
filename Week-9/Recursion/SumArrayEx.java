public class SumArrayEx {
    private static int sumArray(int[] numbers, int index){
        if(index == numbers.length - 1){
            return numbers[index];
        }

        return sumArray(numbers, index + 1) + numbers[index];
    }

    public static int sumArray(int[] numbers){
        return sumArray(numbers, 0);
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sumArray(new int[]{2, 4, 2, 6}));
    }
}
