package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Random number; create new instance of the random class
        Random rand = new Random();
   //Get random number
        int num = rand.nextInt(10)+1; //Upper bound of 10 for values from 1-10;
   //adding the one would not include the 0 because it goes from 0-10; only want 1-10;
   //so for 5 to 10? +5 = starts from 5; +1 starts from 1.
        Scanner input = new Scanner (System.in);
        System.out.println("Guess a number between 1 and 10");
        System.out.println("num to guess" + num);
        System.out.println("Enter a number");
        int guess = input.nextInt();

        while (guess != num){
            //while user's number does not equal num generated keep guessing. This condition will eval to true and execute the loop
            System.out.println("That is incorrect.Guess again!");
            guess= input.nextInt();//chance to enter a second number
        }
        System.out.println("You're right!");//if guess ==num; loop ends
    }
}
