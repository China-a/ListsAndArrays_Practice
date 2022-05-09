package Practice_Exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        System.out.println("Please enter number");

        while(true) {
            int inputOfUsersNumbers = scanner.nextInt();

            if (inputOfUsersNumbers == 0) {
                System.out.println("Done entering integers into the list");
                break;
            }
            else {
                listOfNumbers.add(inputOfUsersNumbers);
            }

        }

       for( Integer number: listOfNumbers) {
            System.out.print( number + " ,  ");
        }
        System.out.print("were the items in the list.");

       int sum = 0;

       for(Integer number: listOfNumbers){
            sum += number;
       }
        System.out.println("The sum of that list is: " + sum);
    }
}
