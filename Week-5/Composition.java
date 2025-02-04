class Engine{
    private String type;

    public Engine(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}

class Car{
    private Engine engine;

    public Car(String engineType){
        this.engine = new Engine(engineType);
    }

    @Override
    public String toString(){
        return "This car has a " + engine.getType() + " type engine.";
    }
}

public class Composition {
    public static void main(String[] args) {
        Car myCar = new Car("V6");
        Car myOtherCar = new Car("Inline 4");

        System.out.println(myCar);
        System.out.println(myOtherCar);
    }
}
