import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate the area and circumference
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        // Print the results
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
