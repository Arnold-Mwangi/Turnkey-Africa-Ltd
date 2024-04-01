# Turnkey-Africa-Ltd
## Assessments Q1
- Write a Java program that generates a Fibonacci sequence. The program should ask the user for an
input number and then print the Fibonacci sequence up to that number.
## * Fibonnaci
- Fibonnaci is a sequence where the current number is the sum of the two preceding ones in a sequence

#### Quiz BDD
<ol>
  <li>Get input from user, (should be a number)</li>
  <li>Validate user input </li>
  <li>Generate Fibonacci Sequence 
    <ul>
        <li>Initialize two variables to store the first and second terms of the sequence.</li>
        <li>Print the first two terms of the sequence.</li>
        <li>Use a loop to generate the subsequent terms of the sequence:
            <ul>
                <li>Calculate the next term as the sum of the previous two terms.</li>            
                <li>Print the next term.</li>
                <li>Update the variables storing the previous two terms.</li>
            </ul>
        </li>
     </ul>
     <li>Print the Fibonacci sequence up to the specified number of terms.</li>
  </li>
</ol>

## Assessments Q2
- Implement a function in Java programming language that takes a list of integers as input and
returns the largest difference between any two numbers in the list. For example, given the input
[1, 9, 3,7], the function should return 8, as the largest difference is between 1 and 9.

## * Maximum Difference
#### Quiz BDD
<ol>
    <li>Define a main function to handle program execution.</li>
    <li>Validate the input: Check if the list of integers is provided.</li>
    <li>Convert the input strings to integers.</li>
    <li>Get the mx integer in the list</li>
    <li>Get the min Integer in the list</li>
    <li>Calculate the largest difference between the max and min  numbers in the list.</li>
    <li>Print the result.</li>
</ol>


## Assessments Q3.
-Consider the following Java code:
```bash 
public class AverageCalculator {
public static double calculateAverage(int[] numbers) {
int total = 0;
for (int num : numbers) {
total += num;
}
double average = total / numbers.length;
return average;
}
public static void main(String[] args) {
int[] data = {5, 10, 15, 20, 25};
double result = calculateAverage(data);
System.out.println("The average is: " + result);
}
}
```


- The bug exists in line :
```bash 
double average = total / numbers.length; 
```
- `Total` variable is an integer meaning it will always store a full value with no decimalplaces
- `numbers.length` is also an integer hence the two wont take in floating numbers
- Hence the division will be an integer division resulting in loss of precision.

To fix this issue we can convert Total variable to doubles before performing the division by casting `total` variable to a `double` explicitly as shown below
 ```bash
 double average = (double) total / numbers.length;
 ```