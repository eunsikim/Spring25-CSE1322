public class Counter {
    public static void count(int n){
        // Base
        if(n == -1){
            return;
        }
        System.out.println("count(" + n + ")");
        // Recursive Call
        System.out.println("\tCount: " + n);
        count(n - 1);
        System.out.println("\tCount: " + n);
        
        System.out.println("count(" + n + ")");
    }
    public static void main(String[] args) {
        int number = 5;
        // for(int i = 0; i <= number; i++){
        //     System.out.println("Count: " + i);
        // }

        count(number);
    }
}
