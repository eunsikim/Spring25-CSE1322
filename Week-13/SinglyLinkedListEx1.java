class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public LinkedList(){
        head = null;
    }

    // Addition Operations
    public void addFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        // Traverse the Linked List from the beginning (HEAD)
        for(Node curr = head; curr != null; curr = curr.next){
            // "STOP" at the last node in the linked list
            if(curr.next == null){
                curr.next = newNode;
                return;
            }
        }
    }

    // Deletion Operations
    // Delete by data
    public void delete(int data){
        if(head == null){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        for(Node curr = head; curr != null; curr = curr.next){
            // "STOP" one node BEFORE the to-be-deleted node
            if(curr.next != null && curr.next.data == data){
                curr.next = curr.next.next;
                return;
            } 
        }
    }
}

public class SinglyLinkedListEx1 {
    public static void main(String[] args) {
        
    }
}
