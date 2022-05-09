package Lesson;
import java.util.Scanner;


//public class PrintDebug {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int amountOfNumbers = 0;
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter a number, negative numbers will cause the program to end");
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number < 0) {
//                break;
//            }
//
//            if (amountOfNumbers >= 4) {
//                break;
//            }
//
//            amountOfNumbers++;
//            sum = sum + number;
//        }
//
//        if (sum == 0) {
//            System.out.println("The average could not be calculated.");
//        } else {
//            System.out.println("Average: " + (1.0 * sum / amountOfNumbers));
//        }
//    }
//}


public class PrintDebug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("-- values: " + amountOfNumbers + ", sum: " + sum);

            System.out.println("Enter a number, negative numbers will cause the program to end");
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                System.out.println("-- loop is exiting because you entered a negative number");
                break;
            }

            if (amountOfNumbers >= 4) {
                System.out.println("-- loop is exiting because 5 numbers have been entered");
                break;
            }

            amountOfNumbers++;
            sum = sum + number;
        }

        System.out.println("-- loop condition now evaluates to false and has been exited");
        System.out.println("-- values: " + amountOfNumbers + ", sum: " + sum);

        if (sum == 0) {
            System.out.println("The average could not be calculated.");
        } else {
            System.out.println("Average: " + (1.0 * sum / amountOfNumbers));
        }
    }
}