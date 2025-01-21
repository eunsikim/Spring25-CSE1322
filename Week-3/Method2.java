public class Method2 {
    public static void print(String message, int times){
        for(int i = 0; i < times; i++){
            System.out.println(message);
        }
    }
    
    public static void main(String[] args) {
        String msg = "Hello, World!";
        int t = 5;

        print(msg, t);
    }
}
