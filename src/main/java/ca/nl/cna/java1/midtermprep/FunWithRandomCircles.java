package ca.nl.cna.java1.midtermprep;

import java.util.Random;

public class FunWithRandomCircles {

    public static void main(String[] args) {
        System.out.println("Fun with Random Circles");

        Random random = new Random();

        //Print 10 random circles with radius between 1 and 10
        for (int i = 0; i < 10; i++) {
            //Note: random.netIn(10) returns ints between 0 and 9 so add 1
            Circle circle = new Circle(random.nextInt(10) + 1);
            printCircleInformation(circle);
        }

    }

    /**
     * Print out a circles information. Example print: Circle with Radius: 4.00, Perimeter: 25.132741 and Area: 50.27
     * @param circle circle
     */
    public static void printCircleInformation(Circle circle){
        System.out.printf("\nCircle with Radius: %.2f, Perimeter: %f and Area: %.2f",
                circle.getRadius(), circle.getPerimeter(), circle.getArea());
    }

}
