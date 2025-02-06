class Person{
    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void action(){
        System.out.println("This person is doing something.");
    }
}

class Student extends Person{
    private double GPA;

    public Student(String firstName, String lastName, double GPA){
        super(firstName, lastName);
        this.GPA = GPA;
    }

    @Override
    public void action(){
        System.out.println("This student is in class");
    }

    public double getGPA(){
        return GPA;
    }
}

class Faculty extends Person{
    public Faculty(String firstName, String lastName){
        super(firstName, lastName);
    }

    @Override
    public void action(){
        System.out.println("This instructor is grading");
    }
}

public class PersonExample {
    public static void main(String[] args) {
        
        Person[] people = new Person[3];
        
        people[0] = new Student("John", "Doe", 3.5);

        people[1] = new Faculty("Eun Sik", "Kim");

        people[2] = new Person("asd", "asdf");

        for(Person p : people){
            
        }
        
    }
}
