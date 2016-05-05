package session3;
import java.util.Scanner;

public class ACD_JAVAB_Session_3_Assignment_1_Main {

	public static void main(String[] args) 
	{
		double num, squareroot, cuberoot;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Square Root & Cube Root of a Given Number");
		System.out.println("------------------------------------------");
		System.out.println("Enter the Number : ");
		num = s.nextDouble();
		s.close();
		squareroot = Math.sqrt(num);
		cuberoot = Math.cbrt(num);
		System.out.println("Square Root of " + num + " : " + squareroot);
		System.out.println("Cube Root of " + num + " : " + cuberoot);
	}
}
