public class Counter {
    public static void counter(int number){
        // Base case: Since we count from number to 
        // 0, we should stop at -1
        if(number < 0){
            return;
        }
        
        // Recursive Call: Since we count from number 
        // to 0, each call should decrease number by 1
        counter(number - 1);
        System.out.println("Counter: " + number);
    }

    public static void main(String[] args) {
        counter(10);
    }
}
