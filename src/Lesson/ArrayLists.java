package Lesson;
import java.util.ArrayList;
// import the list class from the java.util package

//public class ArrayLists {
//    public static void main(String[] args) {
//
//                // create a list - this is a list of Strings
//                ArrayList list = new ArrayList<>();
//
//                // list isn't being used here but this is the steps necessary to create one within your program
//    }
//}


// List containing different types of values
//public class ArrayLists {
//    public static void main(String[] args) {
//
//        ArrayList list1 = new ArrayList<>();
//        list1.add(11);
//
//        ArrayList list2 = new ArrayList<>();
//        list2.add(58.92);
//
//        ArrayList list3 = new ArrayList<>();
//        list3.add(false);
//
//        ArrayList list4 = new ArrayList<>();
//        list4.add("Strings are reference type variables");
//
//        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println(list3);
//        System.out.println(list4);
//    }
//}

//
public class ArrayLists {
    public static void main(String[] args) {

        // create a list that stores Strings
        ArrayList<String> listOfStrings = new ArrayList<String>();

        // add two values to the list
        listOfStrings.add("First");
        listOfStrings.add("Second");

        // retrieve the value from position 0 of the list and print it
        System.out.println(listOfStrings.get(0)); // prints "First"
        System.out.println(listOfStrings); // prints entire list
    }

}




//public class ArrayLists {
//    public static void main(String[] args) {
//
//       ArrayList list1 = new ArrayList<>();
//
//        list1.add(11);
//        list1.add(58.92);
//        list1.add(false);
//        list1.add("Strings are reference type variables");
//
////        ArrayList<Integer> list5 = new ArrayList<>();
//    }
//}