package ca.nl.cna.java1.controlstructures.whileloop;

import java.util.Random;

public class LoopConditionExample {

    public static void main(String[] args) {
        System.out.println("Fun with loop conditions");

        System.out.println("\nUsing a while true loop which is a bad idea!");
        //NEVER EVER DO THIS
        while(true){
            System.out.println("In bad loop! :/");
            if(eventuallyTrue()){
                break;
            }
        }

        //DO THIS INSTEAD! :)
        System.out.println("\nThe correct way to do it:");
        while(!eventuallyTrue()){
            System.out.println("In good loop! :)");
        }

    }

    /**
     * A method that returns true 10% of the time for demonstration purposes using Java.util.Random
     * @return true 10% of the time, false otherwise.
     */
    public static boolean eventuallyTrue(){
        Random random = new Random();

        return random.nextInt(10) == 9;
    }


}
