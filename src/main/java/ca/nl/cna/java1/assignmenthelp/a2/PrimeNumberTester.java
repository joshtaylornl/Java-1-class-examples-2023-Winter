package ca.nl.cna.java1.assignmenthelp.a2;

public class PrimeNumberTester {

    public static void main(String[] args) {

        System.out.print("Determine if numbers are prime");

        for (int i = 2; i < 25; i++) {
            System.out.printf("\n%d Prime? %b Factors: %s", i,
                    PrimeNumberCalculator.isPrime(i),
                    PrimeNumberCalculator.getUniquePrimeFactorization(i));
        }


    }

}
