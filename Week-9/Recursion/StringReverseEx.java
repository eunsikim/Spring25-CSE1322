public class StringReverseEx {
    public static String string_reverse(String word){
        if(word.length() == 1){
            return word;
        }

        return string_reverse(word.substring(1)) + word.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(string_reverse("ABCD"));
    }
}
