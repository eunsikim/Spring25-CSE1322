public class FibonacciEx {
    public static int Fib(int n){
        if((n == 1) || (n == 2)){
            return 1;
        }

        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Fib(6));
    }
}
