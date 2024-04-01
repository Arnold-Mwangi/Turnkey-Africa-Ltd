import java.util.HashMap;
import java.util.Scanner;

public class FibonacciSequence {
    private static  HashMap<Integer, Integer> memo = new HashMap<>(); // INitiate a memory location for already calculated fibonnacci's

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input and pass it to scanner
        int numTerms = getValidInput(scanner);

        // Generate fibonnaci sequence
        int[] sequence = fibonacciSequence(numTerms);

        System.out.printf("FIbonnacci sequence to max number: %d%n", numTerms);
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
    public static int[] fibonacciSequence(int numTerms) {
        int[] sequence =  new int[numTerms];
        for (int i = 0; i < numTerms; i++) {
            sequence[i] = fibonacci(i);
        }

        return sequence;

    }

    // Function to calculate Fibonacci number using memoization
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }

        //check if if fibonacci number  "n" is memoized
        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        // Calculate fibonacci fo "n" term
        int fibNUm = fibonacci(n - 1) + fibonacci(n - 2);
        
        // Memoize result of  fibonacci number "n"
        memo.put(n,fibNUm );
        return fibNUm ;
    }

}