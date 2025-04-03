import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("Item 1");
        myStack.push("Item 2");
        myStack.push("Item 3");
        System.out.println(myStack.peek());

        String nextItem = myStack.pop();
        System.out.println("Next Item to do is: " + nextItem);
        System.out.println(myStack.peek());
    }
}
