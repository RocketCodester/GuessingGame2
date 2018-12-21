/*
 12/8/14
 JDK 1.7
 Guessing game
 */

import javax.swing.JOptionPane;

public class GuessingGame {

    public static void main(String[] args) {
        int count = 1;
        //generate a random number from 1 to 100
        int randomNum = (int) (Math.random() * 100 + 1);
        //display the correct guess for testing purposes
        System.out.println("The correct guess would be "
                + randomNum);
        int guess;
        do {
            guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100"));
            JOptionPane.showMessageDialog(null, "Your guess of " + guess + " is "
                    + determineGuess(randomNum, guess), "Guess " + count, 1);
            System.out.println(count++);
        } while (guess != randomNum);
    }

    public static String determineGuess(int r, int g) {
        if (g < 1 || g > 100) {
            return "out of bounds";
        } else if (r == g) {
            return "correct";
        } else if (r < g) {
            return "too high";
        } else {
            return "too low";
        }
    }
}
