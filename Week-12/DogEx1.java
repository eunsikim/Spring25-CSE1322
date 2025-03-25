class Dog implements Runnable {
    static int dogCounter = 0;
    int ID;

    Dog() {
        ID = ++dogCounter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println ("Dog:"+ID+"\tat:"+i);
        }
    }
}
    
public class DogEx1{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        t2.start();
    }
}