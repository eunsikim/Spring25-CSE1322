import java.util.ArrayList;

class Order{
    private static int nextOrderNum = 1000;
    private int orderNum;
    private String description;
    private int quantity;
    private double orderTotal;

    public Order(String d, int q, double t){
        orderNum = nextOrderNum++;
        description = d;
        quantity = q;
        orderTotal = t;
    }

    public int getID(){
        return orderNum;
    }

    @Override
    public String toString(){
        return orderNum + " quantity " + quantity + " of description " + description + " Total Cost: $" + orderTotal;
    }
}

class OrderQueue{
    private ArrayList<Order> theOrders = new ArrayList<>();

    public void addOrder(Order newOrder){
        theOrders.add(newOrder);
    }

    public boolean isEmpty(){
        return theOrders.size() == 0;
    }

    public Order getNextOrder(){
        Order nextOrder = theOrders.get(0);
        theOrders.remove(0);
        return nextOrder;
    }
}

class QueueWorker implements Runnable{
    OrderQueue theQueue;

    int id;

    public QueueWorker(OrderQueue liveQueue, int id){
        theQueue = liveQueue;
        this.id = id;
    }

    public void processOrder(Order anOrder){
        System.out.println("Thread: " + id +"Processed: " + anOrder);
    }

    @Override
    public void run(){
        while(!theQueue.isEmpty()){
            processOrder(theQueue.getNextOrder());

            try{
                Thread.sleep(500);
            }
            catch(Exception e){

            }
        }
    }
}

public class OrderEx1 {
    public static void main(String[] args) {
        OrderQueue myOrderQueue = new OrderQueue();

        myOrderQueue.addOrder(new Order("Milk", 2, 5.40));
        myOrderQueue.addOrder(new Order("Cheese", 1, 2.50));
        myOrderQueue.addOrder(new Order("Bread", 1, 3.42));
        myOrderQueue.addOrder(new Order("Apples", 4, 2.40));

        QueueWorker ow1 = new QueueWorker(myOrderQueue, 1);
        QueueWorker ow2 = new QueueWorker(myOrderQueue, 2);

        Thread t1 = new Thread(ow1);
        Thread t2 = new Thread(ow2);

        t1.start();
        t2.start();

    }
}
