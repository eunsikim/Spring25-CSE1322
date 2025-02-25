public class Counter {
    public static void count(int n){
        // Base case
        if(n == -1){
            return;
        }
        
        // Recursive call
        count(n-1);
        
        System.out.println("Count: " + n);
    } 
    public static void main(String[] args) {
        int number = 5;

        // for(int i = 0; i <= number; i++){
        //     System.out.println("Count: " + i);
        // }

        count(number);
    }
}
