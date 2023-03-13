package ca.nl.cna.java1.assignmenthelp.a2;

public class FibonacciTester {

    public static void main(String[] args) {

        System.out.print("Printing Fibonnaci Numbers");
        //Print the first 10
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nPos %d, Value: %d", i, FibonacciCalculator.getFibonacciNumber(i));
        }

        System.out.print("\n\nChecking to see if these numbers are Fibonnaci Numbers");
        //Check the first 25 numbers
        for (int i = 1; i <= 25; i++) {
            System.out.printf("\nIs %d a Fibonacci Number? %b", i, FibonacciCalculator.isFibonacciNumber(i));
        }

    }

}
