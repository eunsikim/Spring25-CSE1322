public class Counter {
    public static void count(int n){
        // Base
        if(n == -1){
            return;
        }
        
        System.out.println("Count: " + n);

        // Recursive Call
        count(n - 1);
    }
    public static void main(String[] args) {
        int number = 5;
        // for(int i = 0; i <= number; i++){
        //     System.out.println("Count: " + (number - i));
        // }

        count(number);
    }
}
