package ca.nl.cna.java1.introduction;

public class FunWithMath {

    public static void main(String[] args) {
        System.out.println("Fun with Math!");

        System.out.printf("The value of PI: %.6f", Math.PI);

        int numberBytes = 4;
        int bitsPerBtye = 8;

        //Printing out the powers of 2. The power 2^(4*8-1) is the upper limit for integers in java
        //Because Java uses 4 bytes to store an int but one bit is used for +/-
        for (int i = 0; i < (numberBytes * bitsPerBtye + 10); i++) {
            System.out.printf("\n2^%d : %d", i, (int) Math.pow(2,i));
        }

        //TODO Demonstrate int rollover

        System.out.printf("\nMax integer value: %d", Integer.MAX_VALUE);

    }

}
