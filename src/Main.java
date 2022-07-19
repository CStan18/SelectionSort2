import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> ints = new ArrayList<>
            (Arrays.asList(5, 7, 4, 9, 8, 5, 6, 3));

    static SelectionSorter selectionSorter = new SelectionSorter();

    static Scanner scnr = new Scanner(System.in);

    public static void printInts()
    {
        for (Integer anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static void main(String[] args) {
        System.out.println("""
                Choose sorting method:
                1. Ascending
                2. Descending""");

        int userInput = scnr.nextInt();

        switch (userInput)
        {
            case 1 :
                System.out.println("Unsorted");
                printInts();
                selectionSorter.ascendingSort(ints);
                System.out.println("\nSorted");
                printInts();
                break;
            case 2 :
                System.out.println("Unsorted");
                printInts();
                selectionSorter.descendingSort(ints);
                System.out.println("\nSorted");
                printInts();
                break;
            default :
                System.out.println("Invalid, please try again.");
                break;
        }
    }
}