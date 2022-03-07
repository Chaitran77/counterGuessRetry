package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] possibleColours = {"red", "green", "blue"};
        int totalCounters = 10;

        Tray tray = new Tray();

        Random random = new Random();
        for (int i = 0; i < totalCounters; i++) {
            String colour = possibleColours[random.nextInt(possibleColours.length)];
            tray.addCounter(new Counter(colour));
        }

        // preview counter colours
//        for (Counter counter: tray.getCounters()) {
//            System.out.println(counter.getColour());
//        }


        // implement the guessing
        System.out.println("The possible colours are " + Arrays.toString(possibleColours));

        int score = 0;
        for (int i = 0; i < tray.getCounters().size(); i++) {
            String guess = getInput("Guess the colour of counter number " + (i+1) + ": ");

            if (tray.getCounter(i).getColour().equalsIgnoreCase(guess)) {
                System.out.println("Correct! + 2 points");
                score += 2;
            } else {
                System.out.println("Incorrect. - 3 points");
                score -= 3;
                // prevent going negative
                if (score < 0) {
                    score = 0;
                }
            }

            System.out.println("Score: " + score);
        }

        System.out.println("Done! You finished the game with " + score + " points!");
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
