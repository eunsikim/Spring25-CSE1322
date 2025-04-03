import java.util.PriorityQueue;

class Patient{
    private String name;
    private int triage_level;

    public Patient(String name, int triage_level){
        this.name = name;
        this.triage_level = triage_level;
    }

    public String getName(){
        return name;
    }

    public int getTriageLvl(){
        return triage_level;
    }

    @Override
    public String toString(){
        return "Patient: " + name + " Triage Level: " + triage_level;
    }
}

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Patient> patients = new PriorityQueue<>((a, b) -> Integer.compare(a.getTriageLvl(), b.getTriageLvl()));

        patients.add(new Patient("Alice", 5));
        patients.add(new Patient("Bob", 2));
        patients.add(new Patient("Charlie", 1));

        while(!patients.isEmpty()){
            System.out.println(patients.poll());
        }
    }
}
