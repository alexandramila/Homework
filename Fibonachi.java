import java.util.Scanner;

public class Fibonachi {
  public static void main (String[] args) {
    int num = 0; 
	int a = 1; int b = 1; int c = 1;
	boolean q = false;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter some number ");
	String input = in.nextLine();	
	try {
        num = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        System.err.println("Invalid number format!");	
        System.exit(0);		
	}
	if (num <= 0) {
		System.out.println("The negative number is entered");
		System.exit(0);
	}
	for (int i = 1; i < num; i++) {
		b = a;
		a = c;
		c = a + b;
		if (c == num) {
			q = true;
		} 
	}	
	if (q == true) {
		System.out.println("Entered numer is Fibonachi number.");
	} else {
		System.out.println("Entered numer is not Fibonachi number.");
	}
  }
}