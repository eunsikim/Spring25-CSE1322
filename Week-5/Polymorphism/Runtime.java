class Mammal{
    public void Eat(){
        System.out.println("This mammal is eating");
    }
}

class Dog extends Mammal{
    @Override
    public void Eat(){
        System.out.println("This dog is eating");
    }
}

class Cat extends Mammal{
    @Override
    public void Eat(){
        System.out.println("This cat is eating");
    }
}

public class Runtime {
    public static void main(String[] args) {
        Mammal m1;
        m1 = new Dog();
        m1.Eat();
        m1 = new Cat();
        m1.Eat();
    }
}