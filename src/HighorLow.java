import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess;
        int num = (int) (Math.random() * 10) + 1;
        do {
            System.out.println("Guess a number from 1-10");
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Enter a number from 1-10");
                in.next();
            }
            guess = in.nextInt();
        } while (guess < 1 || guess > 10);

        if (num > guess) {
            System.out.println("Your guess was to high! The number was " + num);
        } else if (num < guess) {
            System.out.println("Your guess was to low! The number was " + num);
        } else
            System.out.println("You were on the money! The number was " + num);
    }

}



