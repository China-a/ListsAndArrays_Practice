package Practice_Exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
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
        System.out.println("What number are you looking for in the list?");

        int inputOfNumberUserIsLookingFor = scanner.nextInt();
         for ( int i = 0; i <= listOfNumbers.size()-1 ; i++) {
             if (listOfNumbers.get(i) == inputOfNumberUserIsLookingFor) {
                 System.out.println(inputOfNumberUserIsLookingFor + " is at index " + i);
                 scanner.close();
             }
         }
    }
}
