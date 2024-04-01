public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
    int total = 0;
    for (int num : numbers) {
    total += num;
    }

    // Fix truncating of the dicimal part 
    // since total and numbers.length are integers they truncate the dicimal part, we convert them to floats
    double average = (double) total / numbers.length;
    return average;
    }
    public static void main(String[] args) {
    int[] data = {5, 10, 15, 20, 25, 11};
    double result = calculateAverage(data);
    System.out.println("The average is: " + result);
    }
    }