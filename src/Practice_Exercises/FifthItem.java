package Practice_Exercises;
import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfWords = new ArrayList<>();

        System.out.println("Please enter text");

        while(true) {
            String inputOfUsersStrings = scanner.nextLine();

            if (inputOfUsersStrings.equals("")) {
                break;
            }
            else {
                listOfWords.add(inputOfUsersStrings);
            }

        }
        System.out.println("The fifth item in the list is: " + listOfWords.get(4));

        scanner.close();
    }
}