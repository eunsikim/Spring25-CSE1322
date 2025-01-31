public class Main {
    public static void main(String[] args) {
        Student s2 = new Student("John", "Doe", "jdoe@students.kennesaw.edu");
        
        for(int i = 0; i < 10; i++){
            s2.updateAssignment(i, 60);
        }

        System.out.println(s2.grade);

        s2.grade = 100;

        System.out.println(s2.grade);
    }
}