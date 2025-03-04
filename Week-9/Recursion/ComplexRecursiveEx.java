public class ComplexRecursiveEx {
    public static void DoWork(int i){
        System.out.print(i + " ");

        if(i > 2){
            DoWork(i - 1);
            DoWork(i - 2);
        }

        System.out.print(i + " ");
    }
    public static void main(String[] args) {
        DoWork(3);
    }
}
