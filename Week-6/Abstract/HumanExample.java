abstract class Mammal{
    public double temp;
    public double weight;
    public int IQ;

    public Mammal(double temp, double weight, int IQ){
        this.temp = temp;
        this.weight = weight;
        this.IQ = IQ;
    }

    // Concrete Methods
    public void eat(){
        System.out.println("This Mammal is eating");
    }
    public void drink(){
        System.out.println("This Mammal is drinking");
    }

    // Abstract Method
    public abstract void talk();
}

abstract class Primate extends Mammal{
    public String locomotion;
    public Primate(double temp, double weight, int IQ, String locomotion){
        super(temp, weight, IQ);
        this.locomotion = locomotion;
    }
}

class Human extends Primate{
    public Human(double temp, double weight, int IQ, String locomotion){
        super(temp, weight, IQ, locomotion);
    }

    @Override
    public void talk(){
        System.out.println("Hello World!");
    }
}

public class HumanExample {
    public static void main(String[] args) {
        Primate p1 = new Human(37, 80, 130, "Bipedal");

        p1.talk();
    }
}
