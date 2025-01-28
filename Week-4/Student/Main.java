import java.util.Scanner;

public class Main {
    public static void update_name(Student s){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the new first name: ");
        String first_name = sc.nextLine();
        
        System.out.print("Enter the new last name: ");
        String last_name = sc.nextLine();
        
        s.setFirst_name(first_name);
        s.setLast_name(last_name);
    }
    public static void main(String[] args) {
        Student s1 = new Student("John", "Doe", "jdoe@student.kennsaw.edu");

        System.out.println(s1.getFirst_name() + " " + s1.getLast_name());

        update_name(s1);

        System.out.println(s1.getFirst_name() + " " + s1.getLast_name());
    }
}
