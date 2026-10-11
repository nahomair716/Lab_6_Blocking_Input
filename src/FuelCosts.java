import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons;
        double mpg;
        double pricePerGallon;
        do {
            System.out.print("Enter number of gallons in the tank: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input.You may only enter numbers.\nEnter number of gallons in the tank:");
                in.next();
            }
            gallons = in.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input.You may only enter numbers.\nEnter fuel efficiency (miles per gallon):");
                in.next();
            }
            mpg = in.nextDouble();
        } while (mpg <= 0);

        do {
            System.out.print("Enter price of gas per gallon: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input.You may only enter numbers.\nEnter price of gas per gallon:");
                in.next();
            }
            pricePerGallon = in.nextDouble();
        } while (pricePerGallon <= 0);

        double costFor100Miles = (100 / mpg) * pricePerGallon;
        double distanceOnFullTank = gallons * mpg;

        System.out.println("The Cost to drive 100 miles is $" + costFor100Miles);
        System.out.println("Distance with a full tank: " + distanceOnFullTank + " miles");
    }
}

