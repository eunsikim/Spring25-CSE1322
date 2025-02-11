import java.util.ArrayList;

abstract class Shape{
    public String color;
    public int sides_num;

    public Shape(String color, int sides_num){
        this.color = color;
        this.sides_num = sides_num;
    }

    // Abstract Method
    public abstract double get_area();
    public abstract double get_perimeter();
}

class Triangle extends Shape{
    public int base;
    public int height;

    public int[] sides;

    public Triangle(String color, int base, int height, int[] sides){
        super(color, 3);
        this.base = base;
        this.height = height;
        this.sides = sides;
    }

    @Override
    public double get_area(){
        return (base * height) / 2;
    }

    @Override
    public double get_perimeter(){
        double res = 0;

        for(int s : sides){
            res += s;
        }

        return res;
    }
}

class Square extends Shape{
    public int side_lenght;

    public Square(String color, int side_lenght){
        super(color, 4);
        this.side_lenght = side_lenght;
    }

    @Override
    public double get_area(){
        return side_lenght * side_lenght;
    }

    @Override
    public double get_perimeter(){
        return 4 * side_lenght;
    }
}

class Circle extends Shape{
    public int radius;

    public Circle(String color, int radius){
        super(color, 0);

        this.radius = radius;
    }

    @Override
    public double get_area(){
        return 3.14 * (radius * radius);
    }

    @Override
    public double get_perimeter(){
        return 2 * 3.14 * radius;
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        ArrayList<Shape> myShapes = new ArrayList<>();

        myShapes.add(new Triangle("Red", 5, 8, new int[]{4, 5, 6}));
        myShapes.add(new Square("Green", 6));
        myShapes.add(new Circle("Blue", 5));

        for(Shape s : myShapes){
            if(s instanceof Triangle){
                System.out.println("[Triangle]");
            }
            else if(s instanceof Square){
                System.out.println("[Square]");
            }
            else{
                System.out.println("[Circle]");
            }

            System.out.println("Area: " + s.get_area());
            System.out.println("Perimeter: " + s.get_perimeter());

            System.out.println();
        }
    }
}