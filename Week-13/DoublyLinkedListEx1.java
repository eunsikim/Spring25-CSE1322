class Node{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList{
    Node head;
    Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    public void addFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode; // Forgot this line
        head = newNode;
    }

    public void addEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode; // Forgot this line
        tail = newNode;
    }

    public void addMiddle(int data, int index){
        Node newNode = new Node(data);

        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }

        newNode.next = current;
        current.prev.next = newNode;
        newNode.prev = current.prev;
        current.prev = newNode;
    }

    public void print(){
        for(Node curr = head; curr != null; curr = curr.next){
            System.out.print(curr.data + " ");
        }
        System.out.println();
    }
}

public class DoublyLinkedListEx1 {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addFront(5);
        myList.addFront(3);
        
        myList.addMiddle(4, 1);
        myList.print();

    }
}
