import java.util.InputMismatchException;
import java.util.Scanner;

class NumberIsGreaterThanFiveException extends Exception{
    public NumberIsGreaterThanFiveException(String message){
        super(message);
    }
}

class NumerIsLesserThanZeroException extends Exception{
    public NumerIsLesserThanZeroException(String message){
        super(message);
    }
}

public class InClassEx1{

    public static void run(int number) throws NumberIsGreaterThanFiveException, NumerIsLesserThanZeroException{
        if(number > 5){
            throw new NumberIsGreaterThanFiveException("The number should not be greater than 5, try again.");
        }
        else if(number < 0){
            throw new NumerIsLesserThanZeroException("The number should not be lesser than 0, try again");
        }

        System.out.println("Success!");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
        
                run(number);

                break;
            }
            catch(NumberIsGreaterThanFiveException e){
                System.out.println(e.getMessage());
            }
            catch(NumerIsLesserThanZeroException e){
                System.out.println(e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("Only enter integers please, try again.");
                sc.nextLine();
            }
            catch(Exception e){
                System.out.println("Something went wrong");
            }
        }
    }    
}
