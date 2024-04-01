import java.util.HashMap;
import java.util.Scanner;

public class FibonnacciSequence {
    private static final HashMap<Integer, Integer> memo = new HashMap<>(); // INitiate a memory location for already calculated fibonnacci's

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input and pass it to scanner
        int numTerms = getValidInput(scanner);

        // Generate fibonnaci sequence

        System.out.printf("FIbonnacci sequence to max number: %d", numTerms);
        for (int term : sequence) {
            System.out.print(term + " ");
        }

        scanner.close();
    }

    //  function to get valid user input data

    public static int getValidInput(Scanner scanner) {
        int numTerms;

        while(true) {
            System.out.print("Enter the number of terms in the Fibonacci sequence: ");
            if (scanner.hasNextInt()) {
                numTerms = scanner.nextInt();
                if (numTerms > 0) {
                    break;
                } else {
                    System.out.println("Number must bea positive Integer");
                }

            } else {
                System.out.println("Invalid input. Enter a valid INteger. ");
                scanner.next();
            }
        }
        return numTerms;
    }
    
    // Function to generate the sequences and memoize  results

}