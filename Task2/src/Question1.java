import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int First_number = sc.nextInt();
		System.out.println("Please enter Second number");
		int Second_numeber= sc.nextInt();
		int add = First_number + Second_numeber;
		int Subtract = First_number - Second_numeber;
		int multiply = First_number * Second_numeber;
		int dividing = First_number / Second_numeber;
		int moduls = First_number % Second_numeber;
		System.out.println("Sum of Integers : " + add);
		System.out.println("Subract of Integers : " + Subtract);
		System.out.println("Multiply of Integers : " + multiply);
		System.out.println("Divinding of Integers : " + dividing);
		System.out.println("Moduls of Integers : " + moduls);
		
	}


}
