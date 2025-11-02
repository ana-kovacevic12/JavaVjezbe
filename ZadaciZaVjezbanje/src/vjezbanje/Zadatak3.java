package vjezbanje;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		double RK=(a*a-b*b);
		
		System.out.printf("razlika kvadrata iznosi RK=%.2f", RK);
		sc.close();
		

	}

}
