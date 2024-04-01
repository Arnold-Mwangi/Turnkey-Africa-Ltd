import java.util.Arrays;

public class LargestDifference {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("%n");
            System.out.println("Usage: java LargestDifference <integer1> <integer2> <integer3> ...");
            return;
        }

        //  COnvert command line arguents to integers
        int[] numbers = new int[args.length];
        for  (int i=0; i<args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer Argument: " + args[i]);
                return;
            }
        }
        
        //  Calculate largest difference
        int largestDifference = findLargestDifference(numbers);

        System.out.println("Largest difference between any two numbers: " + largestDifference);

        // Run tests

        // Run();
    }

    public static int findLargestDifference(int[ ] numbers) {
        // Edge cases
        if (numbers == null || numbers.length < 2) {
            return 0;
        }

        // FInd max and min values
        int minNUmber = Arrays.stream(numbers).min().getAsInt();
        int maxNUmber = Arrays.stream(numbers).max().getAsInt();

        return maxNUmber - minNUmber;
    }

    // Function to run the findLargestDifference
    public static void Run() {
        int[] test1 = {1, 9, 3, 7};
        int[] test2 = {5, 5, 5, 5};
        int[] test3 = {10, 3, 8, 15};

        System.out.println("Test 1: Largest difference: " + findLargestDifference(test1));
        System.out.println("Test 2: Largest difference: " + findLargestDifference(test2));
        System.out.println("Test 3: Largest difference: " + findLargestDifference(test3));
    }

}