public class Main {
    public static void method2(){
        System.out.println("Method 2 was called");
    }

    public static void method1(){
        System.out.println("Method 1 was called");
        method2();
        System.out.println("Method 1 still alive");
    }

    public static void main(String[] args) {
        method2();
        method1();
        System.out.println("Finished!");
    }
}
