import java.util.Scanner;

public class Fibonachi {
  public static void main (String[] args) {
    int num = 0;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter some number ");
	String input = in.nextLine();	
	try {
        num = Integer.parseInt(input);
        System.out.println(num);
    } catch (NumberFormatException e) {
        System.err.println("Invalid number format!");		
	}
	if (num <= 0) {
		System.out.println("The negative number is entered");
	}
  }
}