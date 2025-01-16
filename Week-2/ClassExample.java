/*
 * Make an array of size 10 which holds ints.
 * Using a loop, keep prompting the user to enter a number.
 * Store each number in the next cell of an array.
 * If the user enters -1, or the array is full, stop asking.
 * Print out the smalles of the numbers that were entered (excluding the -1).
 */

import java.util.Scanner;

public class ClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int lastIndex = -1;

        boolean loop = true;


for(int i = 0; i < 10; i++){
    System.out.println("Enter a number, enter -1 to stop: ");
    int input = sc.nextInt();

    if(input == -1){
        loop = false;
        break;
    }
    else{
        numbers[i] = input;
        lastIndex++;
    }
}

int smallest = numbers[0];
for(int i = 0; i <= lastIndex; i++){
    if(numbers[i] < smallest){
        smallest = numbers[i];
    }
}   

        System.out.println("Smallest is: " + smallest);
    }
}
