package ca.nl.cna.java1.midtermprep;

import java.util.Random;

public class FunWithRandoms {

    public static void main(String[] args) {
        System.out.println("Fun with Randoms");

        //Print out 10 random grades, state if they pass (At or above 50) and do a class average
        //Note: randomize grades between 40 and 90. Hint: Grab a value between 0 and 50 and add it to 40

        Random random = new Random();
        int total = 0;
        int numGrades = 1000;

        for (int i = 0; i < numGrades; i++) {
            int grade = random.nextInt(51) + 40;

            System.out.printf("\nGrade: %d ", grade);

            if(grade >= 50){
                System.out.printf("Passed!");
            } else {
                System.out.printf("Failed :(");
            }

            total += grade;
        }

        System.out.printf("\n\nClass Average: %d", total/numGrades);

    }

}
