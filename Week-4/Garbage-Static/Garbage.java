class Number{
    // Attribute
    int x;

    // Constructor
    public Number(int x){
        this.x = x;
    }
}

public class Garbage {
    public static void main(String[] args) {
        Number a = new Number(5);

        a = new Number(8);
    }
}
