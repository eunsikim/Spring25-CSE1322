class Number{
    int x;
    static int z = 0;

    public Number(int x){
        this.x = ++z;
    }
}

public class Static {
    public static void main(String[] args) {
        Number n1 = new Number(8);
        System.out.println(n1.x);
        Number n2 = new Number(100);
        System.out.println(n2.x);
    }
}


