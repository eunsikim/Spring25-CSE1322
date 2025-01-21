public class Sample {
    public static void B(int x){
        x += 9;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int a = 42;
        System.out.println(a);
        B(a);
        System.out.println(a);
    }
}
