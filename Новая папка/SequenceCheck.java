import java.util.Scanner;

public class SequenceCheck {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter some number:");
	String input = in.nextLine();
	String[] sequence = input.split(" ");
	System.out.println(sequence);	
  }
}