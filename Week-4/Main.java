public class Main {
    public static void main(String[] args) {
        Student s1;
        Student s2 = new Student("John", "Doe", "jdoe@students.kennesaw.edu");

        if(s2.sendEmail("Hello, John!")){
            System.out.println("Email sent successfully!");
        }
        else{
            System.out.println("Failed to send the email!");
        }
        System.out.println(s2.first_name + " " + s2.last_name);

        System.out.println(s2);
    }
}