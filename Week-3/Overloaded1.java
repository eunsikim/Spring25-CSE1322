public class Overloaded1 {
    public static float tryMe(int x){
        return x + .375f;
    }

    public static float tryMe(int x, float y){
        return x * y;
    }

    public static void main(String[] args) {
        float result = tryMe(25, 4.32f);
    }
}
