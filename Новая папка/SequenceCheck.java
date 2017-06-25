import java.util.Scanner;

public class SequenceCheck {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter some sequence:");
	String input = in.nextLine();
	String parts[] = input.split(" "); 	
	int sequence[] = new int[parts.length];
	try {
		for (int i = 0; i < parts.length; i++){
            sequence[i] = Integer.parseInt(parts[i]);
	    }
	} catch (NumberFormatException e) {
        System.err.println("Invalid number format.");
		System.exit(0);
	}
	for (int i = 0; i < sequence.length; i++) {
	    System.out.println(sequence[i]);
	}		
  }
}