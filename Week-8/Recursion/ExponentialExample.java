public class ExponentialExample {
    public static int exp(int base, int ex){
        if(ex == 1){
            return base;
        }

        return base * exp(base, ex - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(exp(3, 4));
    }
}
