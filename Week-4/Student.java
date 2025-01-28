class Student{
    // Attributes: first name, last name, etc.
    public String first_name;
    public String last_name;
    public String email;
    public double[] Assignments;
    public double grade;

    // Default Constructor
    public Student(){
        first_name = "John";
        last_name = "Doe";
        email = "";
        Assignments = new double[10];
        grade = 0;
    }

    // Constructor
    public Student(String first_name, String last_name, String email){
        // Initialize some attributes
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;

        // Initialize the Assignments array
        this.Assignments = new double[10];
        // Update the grade
        this.grade = updateGrade();
    }

    // Overloaded constructor
    public Student(String first_name, String last_name, String email, double[] Assignments){
        // Initialize some attributes
        this(first_name, last_name, email);
        
        this.Assignments = Assignments;

        // Update the grade
        this.grade = updateGrade();
    }

    // Behaviors: update grade, send email, etc.
    public double updateGrade(){
        double sum = 0;

        for(double assignment : Assignments){
            sum += assignment;
        }

        grade = sum / Assignments.length;

        return grade;
    }

    public boolean sendEmail(String message){
        // We do not have a real email system, so we will just print the message
        System.out.println("Sending an email to " + email);
        System.out.println("Message:\n" + message);
        return true;
    }

    public void updateAssignment(int index, double grade){
        Assignments[index] = grade;
        updateGrade();
    }

    @Override
    public String toString(){
        return first_name + " " + last_name + " " + email;
    }
}