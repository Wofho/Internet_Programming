import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args){
		String result;
		String input;
		
		Scanner inputReader = new Scanner(System.in); 
		input = inputReader.nextLine();
		result=input.toUpperCase();
		
		System.out.println(result);
		
		
	}
}
