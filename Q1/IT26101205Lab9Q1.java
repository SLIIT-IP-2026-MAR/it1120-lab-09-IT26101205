import java.util.Scanner;

public class IT26101205Lab9Q1 { 

    public static void main(String[] args) {
		
		double a, b, c, root1, root2;
	
		Scanner input = new Scanner(System.in);
		
		// Input values for a, b, and c
        System.out.print("Enter value a: ");
        a = input.nextDouble();
        
        System.out.print("Enter value b: ");
        b = input.nextDouble();
        
        System.out.print("Enter value c: ");
        c = input.nextDouble();
		
		double d = Math.pow(b, 2) - (4 * a * c);

        if (d >= 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("\nRoots are real and different:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
        else {
            System.out.println("Roots are imaginary");
        }
	}
}