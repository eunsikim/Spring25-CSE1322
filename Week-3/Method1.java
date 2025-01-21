public class Method1 {
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int someNum = 256;

        if(isEven(someNum)){
            System.out.println(someNum + " is even");
        } else {
            System.out.println(someNum + " is odd");
        }
    }
}
