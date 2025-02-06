import java.util.Scanner;

class PaymentMethod{
    public boolean processPayment(){
        return true;
    }
}

class Card extends PaymentMethod{
    @Override
    public boolean processPayment() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter card number:");
        String cardNum = sc.nextLine();

        System.out.println("Enter CVC");
        String cvcNum = sc.nextLine();

        // Validate payment
        boolean valid = true;

        return valid;
    }
}

class Paypal extends PaymentMethod{
    @Override
    public boolean processPayment(){
        System.out.println("Re-directing Paypal");

        // Validate payment
        boolean valid = true;

        return valid;
    }
}

public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PaymentMethod method = new PaymentMethod();

        System.out.print("How do you want to pay? (Card/Paypal): ");

        String methodSelected = sc.nextLine();

        if(methodSelected.equals("Card")){
            method = new Card();
        }
        else if(methodSelected.equals("Paypal")){
            method = new Paypal();
        }

        method.processPayment();
    }
}
