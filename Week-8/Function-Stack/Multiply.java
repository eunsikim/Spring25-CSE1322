public class Multiply {
    public static int mult(int n1, int n2){
        // base case
        if(n1 == 0){
            return 0;
        }

        // Recursive call
        return n2 + mult(n1 - 1, n2);
    }

    public static void main(String[] args) {
        System.out.println(mult(3, 5));
    }
}
