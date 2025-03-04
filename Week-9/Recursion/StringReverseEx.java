public class StringReverseEx {
    public static String reverse_string(String someString){
        if(someString.isEmpty()){
            return someString;
        }

        return reverse_string(someString.substring(1)) + someString.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse_string("ABCD"));
    }
}
