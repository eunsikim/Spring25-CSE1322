import java.util.PriorityQueue;
import java.util.Comparator;

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

class TriageLevelComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer x, Integer y){
        if(x <= y){
            return 1;
        }
        else if(x > y){
            return -1;
        }
        return 0;
    }
}

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new TriageLevelComparator();
        PriorityQueue<Patient> patients = new PriorityQueue<>((a, b) -> comparator.compare(a.getTriageLvl(), b.getTriageLvl()));


        patients.add(new Patient("Alice", 1));
        patients.add(new Patient("Bob", 5));
        patients.add(new Patient("John", 2));
        patients.add(new Patient("Charlie", 1));

        while(!patients.isEmpty()){
            System.out.println(patients.poll());
        }
    }
}
