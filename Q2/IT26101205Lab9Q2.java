import java.util.Scanner;

public class IT26101205Lab9Q2 {

	//method to calculate the area of circle
	public static double circleArea(double radius) {
        return Math.PI * radius * radius; //Area=pi*r^2
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        area = circleArea(radius); //call the circleArea method

        System.out.println("The Area of the circle with radios" + radius + "is:" + area);
    }
}