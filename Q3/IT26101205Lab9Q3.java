public class IT26101205Lab9Q3 {
	
	public static int add(int a, int b) { //method to add two intege
        return a + b;
    }

    public static int multiply(int a, int b) { //multiply
        return a * b;
    }

    public static int square(int a) { //square an integer
        return multiply(a,a); //reusing multiply method
    }

    public static void main(String[] args) {

        int ans1, ans2;

        //(3*4+5*7)^2
		ans1 = square(add(multiply(3, 4), multiply(5, 7)));
		System.out.println("Result of (3*4 + 5*7)^2\t:" + ans1);

        //(4+7)^2 + (8+3)^2
		ans2 = add(square(add(4, 7)), square(add(8, 3)));
		System.out.println("Result of (4+7)^2 + (8+3)^2\t: " + ans2);

    }
}
