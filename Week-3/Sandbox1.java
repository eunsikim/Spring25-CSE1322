public class Sandbox1 {
    public static boolean isEven(int num){
        return num % 2 == 0; // True == Even, False == Odd
    }

    public static void helloWorld(boolean flag){
        if(flag){
            System.out.println("Hello World");
            System.out.println("Goodbye World");
            return;
        }

        System.out.println("Hello World");
    }

    public static double addition(int x, int y){
        return x + y;
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static int fn(int x){
        x += 5;

        return x;
    }
        
    public static void main(String[] args) {
        int x = 10;

        x = fn(x);

        System.out.println(x);
    }
}
