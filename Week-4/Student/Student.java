class Student{
    // Attributes: first name, last name, etc.
    private String first_name;
    private String last_name;
    private String email;
    private double[] Assignments;
    private double grade;

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
    
    public boolean sendEmail(String message){
        // We do not have a real email system, so we will just print the message
        System.out.println("Sending an email to " + email);
        System.out.println("Message:\n" + message);
        return true;
    }

    // Getters
    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getEmail(){
        return email;
    }
    public double[] getAssignments(){
        return Assignments;
    }
    public double getGrade(){
        return grade;
    }
    

    // Setters
    public void setFirst_name(String first_name){
        if(first_name.isEmpty()){
            System.out.println("First name cannot be empty!");
            return;
        }
        else if(this.first_name.equals(first_name)){
            System.out.println("First name is already set to " + first_name);
            return;
        }

        this.first_name = first_name;
    }

    public void setLast_name(String last_name){
        if(last_name.isEmpty()){
            System.out.println("Last name cannot be empty!");
            return;
        }
        else if(this.last_name.equals(last_name)){
            System.out.println("Last name is already set to " + last_name);
            return;
        }

        this.last_name = last_name;
    }

    public void updateAssignment(int index, double grade){
        Assignments[index] = grade;
        updateGrade();
    }

    public double updateGrade(){
        double sum = 0;

        for(double assignment : Assignments){
            sum += assignment;
        }

        grade = sum / Assignments.length;

        return grade;
    }


    @Override
    public String toString(){
        return first_name + " " + last_name + " " + email;
    }
}