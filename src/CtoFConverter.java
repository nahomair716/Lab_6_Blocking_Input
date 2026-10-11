import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        boolean playAgain = false;
        while (!playAgain) {
            System.out.println("Convert Celsius to Fahrenheit!");

            do {
                System.out.println("Input your Temperature in Celsius");

                while (!in.hasNextDouble()) {
                    System.out.println("Your input is invalid. Please try again\n\"Input your Temperature in Celsius");
                    in.next(); // clear invalid input
                }

                celsius = in.nextDouble();
            } while (false);
                fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
                if (fahrenheit >= 100) {
                    System.out.println("The temperature is " + fahrenheit + "°F which is boiling");

                } else if (fahrenheit <= 0) {
                    System.out.println("The temperature is " + fahrenheit + "°F which is freezing");

                } else {
                    System.out.println("The temperature is " + fahrenheit + "°F");
                }
                System.out.println("Run Again? [Y/N]");
                if (in.next().equals("N")) {
                    playAgain = true;
                }

        }
    }
}