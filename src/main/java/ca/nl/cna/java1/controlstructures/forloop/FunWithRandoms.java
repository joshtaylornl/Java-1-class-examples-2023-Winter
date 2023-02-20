package ca.nl.cna.java1.controlstructures.forloop;

import java.util.Random;

/**
 * In class example to demonstrate the use of Java.util.Random
 * @author josh.taylor
 */
public class FunWithRandoms {

    public static void main(String[] args) {
        System.out.println("Fun with Randoms [Numbers]");

        Random random = new Random();

        //Generate 10 random integers between 1 and 100 to simulate the class marks
        System.out.println("Random dice style roll: ");
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d, ", random.nextInt(6) + 1);
        }

        System.out.println("Random ints\n");

        //Generate 10 random integers
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, ", random.nextInt());
        }


    }

}
