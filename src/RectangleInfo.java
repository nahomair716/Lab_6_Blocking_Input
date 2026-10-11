import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width;
        double height;
        double area;
        double perimeter;
        double pyth;

        do {
            System.out.println("Whats the width of the rectangle?");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Enter a valid number");
                in.next();
            }
            width = in.nextDouble();
            in.nextLine();
        }
        while (width < 0);

        do {
            System.out.println("Whats the height of the rectangle?");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Enter a valid number");
                in.next();
            }
            height = in.nextDouble();
            in.nextLine();
        }
        while (height < 0);

        area = width * height;
        perimeter = (width * 2) + (height * 2);
        pyth = Math.sqrt((width * width) + (height * height));

        System.out.println(" The Area of the Rectangle is " + area);
        System.out.println(" The Perimeter of the Rectangle is " + perimeter);
        System.out.println(" The Diagonal Length of the Rectangle is " + pyth);

    }
}
