class Mammal{
    public float temp;
    public float weight;
    public int IQ;
    public String furColor;

    public Mammal(float temp, float weight, int IQ, String furColor){
        this.temp = temp;
        this.weight = weight;
        this.IQ = IQ;
        this.furColor = furColor;
    }

    public void Eat(){
        System.out.println("This mammal is eating");
    }
    public void Drink(){
        System.out.println("This mammal is drinking");
    }
    public void Move(){
        System.out.println("This mammal is moving");
    }
    public Mammal GiveBirth(){
        System.out.println("Mammal is giving birth to another mammal");
        return new Mammal(30.4f, 300f, 1, "brown");
    }
}

class Dog extends Mammal{
    public int BarkVolume;

    public Dog(float temp, float weight, int IQ, String furColor, int BarkVolume){
        super(temp, weight, IQ, furColor);
        this.BarkVolume = BarkVolume;
    }

    public void Bark(){
        System.out.println("This dog is barking at " + BarkVolume + " dB.");
    }

    @Override
    public void Eat(){
        System.out.println("This dog is eating");
    }

    @Override
    public String toString(){
        return "This is a Dog object";
    }
}

class Labrador extends Dog{
    public Labrador (float temp, float weight, int IQ, String furColor, int BarkVolume){
        super(temp, weight, IQ, furColor, BarkVolume);
    }
}

public class Driver {
    public static void main(String[] args) {
        // 38 celsius, 20 kg, 100 IQ, Brown Fur, 100dB bark
        Dog d1 = new Dog(38f, 20, 100, "Brown", 100);

        Mammal m1 = new Mammal(38f, 20, 100, "Brown");

        Labrador l1 = new Labrador(38f, 20, 100, "Brown", 100);

        m1.Eat();
        d1.Eat();
        l1.Eat();
    }
}
