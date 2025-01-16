public class Arrays {
    public static void main(String[] args) {
        // Array of Strings
        String[] names = new String[5];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        for(String person : names){
            System.out.println(person);
        }

        // Array of doubles
        // We can initialize values into the array 
        // at the same time as we declare it
        double[] grades = {92.8, 78.4, 44.6};
        
        double sum = 0;
        
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }

        double average = sum / grades.length;

        System.out.println("Average: " + average);
    }
}
