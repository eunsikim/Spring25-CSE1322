public class StringFunctions {
    public static void main(String[] args) {
        String message1 = "Hello World!";
        String message2 = "hello world!";

        // Prints message1 as all uppercase or all lowercase
        System.out.println(message1.toUpperCase());
        System.out.println(message1.toLowerCase());

        // Prints the string literal without the leading
        // blank spaces
        System.out.println("  Hello World!".trim());

        // Prints the length of the string
        System.out.println(message1.length());

        // Prints true or false if the strings are equal
        // Case sensitive
        System.out.println(message1.equals(message2));
        // Prints true or false if the strings are equal
        // Case insensitive
        System.out.println(message1.equalsIgnoreCase(message2));

        // Prints the first character of message1
        System.out.println(message1.charAt(0));
        // Prints the second character of message1
        System.out.println(message1.charAt(1));
        // Prints the last character of message1
        System.out.println(message1.charAt(message1.length() - 1));

        // Prints only the first word of the string
        System.out.println("Goodbye World!".substring(0, 7));
        // Prints only the second word of the string
        System.out.println("Goodbye World!".substring(8));

        // Splits message1 by the blank space
        for(String word : message1.split(" ")){
            System.out.print(word + ", ");
        }
        System.out.println();

        // Prints each character of message1
        for(char letter : message1.toCharArray()){
            System.out.print(letter + ", ");
        }
        System.out.println();
    }
}
