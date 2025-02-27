public class Example {
    public static void printNumbers(int n){
        if(n > 0){
            System.out.print(n + " ");
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
