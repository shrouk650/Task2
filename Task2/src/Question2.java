import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int First_number = sc.nextInt();
		System.out.println("Please enter Second number");
		int Second_numeber= sc.nextInt();
		boolean result = First_number < Second_numeber;
		System.out.println("First_number < Second_numeber : " + result);
	    
		result = First_number <= Second_numeber;
		System.out.println("First_number <= Second_numeber : " + result);
		
		result = First_number > Second_numeber;
		System.out.println("First_number < Second_numeber : " + result);
		
		result = First_number >= Second_numeber;
		System.out.println("First_number < Second_numeber : " + result);
		
		result = First_number == Second_numeber;
		System.out.println("First_number == Second_numeber : " + result);
		
		result = First_number != Second_numeber;
		System.out.println("First_number != Second_numeber : " + result);
	}
}
