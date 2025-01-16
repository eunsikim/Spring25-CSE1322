import java.util.Scanner;

public class ClassExcercise1 {
    public static void main(String[] args) {
        double amount;
        double rate;
        int years;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the investment amount: ");
        amount = sc.nextDouble();

        System.out.print("Enter the rate (enter as decimal): ");
        rate = sc.nextDouble();

        System.out.print("Enter year: ");
        years = sc.nextInt();

        for(int i = 0; i < years; i++){
            System.out.println(amount + " += " + (amount * rate));
            amount += amount * rate;
        }

        System.out.println(years + " have passed, you now have $" + amount);
    }
}
