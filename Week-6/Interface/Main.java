abstract class Animal{
    boolean is_alive;

    public Animal(){
        is_alive = true;
    }

    public abstract void make_noise();
}

abstract class Bird extends Animal{
    boolean isEggLaying;

    public Bird(boolean isEggLaying){
        this.isEggLaying = isEggLaying;
    }
}

abstract class Mammal extends Animal{
    boolean isViviparous;

    public Mammal(boolean isViviparous){
        this.isViviparous = isViviparous;
    }
}

class Flying_Squirrel extends Mammal implements IFlyable, IWalkable{
    public Flying_Squirrel(boolean isViviparous){
        super(isViviparous);
    }

    @Override
    public void make_noise(){
        System.out.println("Flying Squirrel is chirping");
    }

    @Override
    public void fly(){
        System.out.println("Flying Squirrel is gliding");
    }

    @Override
    public void walk(){
        System.out.println("Flying Squirrel is walking");
    }
}

class Bat extends Mammal implements IFlyable{
    public Bat(boolean isViviparous){
        super(isViviparous);
    }

    @Override
    public void make_noise(){
        System.out.println("Bat is schreeching");
    }

    @Override
    public void fly(){
        System.out.println("Bat is flying");
    }
}

class Platypus extends Mammal implements IWalkable, ISwimmable{
    public Platypus(boolean isViviparous){
        super(isViviparous);
    }

    @Override
    public void make_noise(){
        System.out.println("Platypus is growling");
    }

    @Override
    public void walk(){
        System.out.println("Platypus is walking");
    }

    @Override
    public void swim(){
        System.out.println("Platypus is swimming");
    }
}

class Blue_Jay extends Bird implements IFlyable{
    public Blue_Jay(boolean isEggLaying){
        super(isEggLaying);
    }

    @Override
    public void make_noise(){
        System.out.println("Blue Jay is chirping");
    }

    @Override
    public void fly(){
        System.out.println("Blue Jay is flying");
    }
}

class Penguin extends Bird implements ISwimmable, IWalkable{ 
    public Penguin(boolean isEggLaying){
        super(isEggLaying);
    }

    @Override
    public void make_noise(){
        System.out.println("Noot Noot");
    }

    @Override
    public void swim(){
        System.out.println("Penguin is swimming");
    }

    @Override
    public void walk(){
        System.out.println("Penguin is walking");
    }
}

interface IFlyable{
    public void fly();
}

interface ISwimmable{
    public void swim();
}

interface IWalkable{
    public void walk();
}

public class Main {
    public static void main(String[] args) {
        Animal[] myAnimals = new Animal[5];

        myAnimals[0] = new Flying_Squirrel(false);
        myAnimals[1] = new Bat(false);
        myAnimals[2] = new Platypus(false);
        myAnimals[3] = new Blue_Jay(false);
        myAnimals[4] = new Penguin(false);

        for(Animal a : myAnimals){
            if(a instanceof ISwimmable){
                ISwimmable temp = (ISwimmable) a;
                temp.swim();
            }
        }
    }
}