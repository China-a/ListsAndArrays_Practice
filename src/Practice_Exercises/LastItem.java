package Practice_Exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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
        System.out.println("The last item in the list is: " + listOfWords.get(listOfWords.size()-1));

        scanner.close();
    }
}
