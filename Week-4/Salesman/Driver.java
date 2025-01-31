import java.util.Scanner;

class Salesman{
    // Basic Info related to a single
    // salesman.
    private String firstName;
    private String lastName;
    private int salesmanSales;
    
    // This member is static because it track
    // all sales done by all salesmen
    private static int globalSales = 0;

    // Constructor
    public Salesman(String firstName, String lastName){
        this.firstName = firstName; // This object's First Name
        this.lastName = lastName;

        salesmanSales = 0;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    // Use when a salesman closes a sale
    // It increases the individual sale and
    // the global sale amount
    public void carSold(){
        salesmanSales++;
        globalSales++;
        System.out.println(this);
    }

    // This member is static since it is used to
    // print the amoun of cars sold by each
    // salesman, but also the total car sold by
    // salemen.
    public static void printReport(Salesman[] allSalesmans){
        for(Salesman s : allSalesmans){
            System.out.println(s);
        }

        System.out.println("Total cars sold: " + globalSales);
    }

    @Override
    public String toString(){
        return getName() + " cars sold: " + salesmanSales;
    }
}

public class Driver {
    public static void main(String[] args) {
        Salesman[] allSalesmen = new Salesman[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Lets add salesmen\n");

        for(int i = 0; i < allSalesmen.length; i++){
            System.out.print("First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Last Name: ");
            String lastName = sc.nextLine();

            allSalesmen[i] = new Salesman(firstName, lastName);
            System.out.println();
        }

        System.out.println("All " + allSalesmen.length + " salesmen were added\n");

        boolean loop = true;

        while(loop){
            System.out.println("1) Car sold");
            System.out.println("2) End of day report");
            int menuChoice = sc.nextInt();

            if(menuChoice == 1){
                System.out.println("\tChoose a salesman:");

                for(int i = 0; i < allSalesmen.length; i++){
                    System.out.println("\t" + i + ")" + allSalesmen[i].getName());
                }

                System.out.print("\t");
                int salemanChoice = sc.nextInt();

                allSalesmen[salemanChoice].carSold();
            }
            else if (menuChoice == 2){
                System.out.println();
                Salesman.printReport(allSalesmen);
                loop = false;
            }
            else{
                System.out.println("Invalid Choice");
            }
            System.out.println();
        }
    }
}
