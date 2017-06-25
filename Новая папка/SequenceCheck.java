import java.util.Scanner;

public class SequenceCheck {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter some sequence:");
	String input = in.nextLine();
	String parts[] = input.split(" "); 
	for (int i = 0; i < parts.length; i++) {
	    System.out.println(parts[i]);
	}	
  }
}