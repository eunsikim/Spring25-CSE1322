class node{
    int data;
    node next;

    public node(int data){
        this.data = data;
        next = null;
    }
}

class Queue{
    node front;
    node back;

    public Queue(){
        front = null;
        back = null;
    }

    public void enqueue(int data){
        node n = new node(data);

        if(front == null){
            front = n;
            back = n;
            return;
        }

        back.next = n;
        back = n;
    }

    public int dequeue(){

        if(front == null){
            return -1;
        }

        int res = front.data;

        front = front.next;

        return res;
    }

}

public class QueueLinkedListEx1 {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println("Processing " + myQueue.dequeue());
        System.out.println("Processing " + myQueue.dequeue());
        System.out.println("Processing " + myQueue.dequeue());


    }
}
