public class Scope {
    public static void print(String msg, int t){
        for(int i = 0; i < t; i++){
            System.out.println(msg);
        }
    }
    public static void main(String[] args) {
        String message = "Hello, World!";
        int time = 5;
        print(message, time);
    }
        
}
