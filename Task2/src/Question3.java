import java.util.Scanner;

public class Question3 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int First_number =sc.nextInt();
		System.out.println("Please enter Second number");
		int Second_numeber= sc.nextInt();
		
		int b = First_number;
		int c = Second_numeber;
	    First_number += Second_numeber;
	    
	    System.out.println("Sum of Integers : " + First_number );
	    
	    
		int x = First_number;
		int y = Second_numeber;
		Second_numeber -= First_number;
	    
	    System.out.println("Subract of Integers : " + Second_numeber);
	    
	    int num1 =  First_number;
	    int num2 = Second_numeber;
	    First_number *= Second_numeber;
	    System.out.println("Multiply of Integers : " + First_number);
	    
	    
	    int A = First_number;
	    int B = Second_numeber;
		First_number /= Second_numeber;
		System.out.println("Divinding of Integers : " + First_number);
		
		
		int E = First_number;
		int N = Second_numeber;
		First_number %= Second_numeber;
		System.out.println("Moduls of Integers : " + First_number);
		
	}
}
