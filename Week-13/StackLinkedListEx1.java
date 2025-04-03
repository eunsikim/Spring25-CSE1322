class node{
    int data;
    node next;

    public node(int data){
        this.data = data;
        next = null;
    }
}

class Stack{
    node top;

    public Stack(){
        top = null;
    }

    public void push(int data){
        node n = new node(data);

        if(top == null){
            top = n;
            return;
        }

        n.next = top;
        top = n;
    }

    public int pop(){
        if(top == null){
            return -1;
        }

        int res = top.data;
        top = top.next;

        return res;
    }

    public int peek(){
        return top.data;
    }
}

public class StackLinkedListEx1 {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.peek());
        
        int data = myStack.pop();
        
        System.out.println("Next Item to do is: " + data);
        
        System.out.println(myStack.peek());
        
    }
}
