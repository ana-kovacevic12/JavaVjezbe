package vjezbanje;
import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a =sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	
	double D=b*b - 4*a*c;
	
	double x1=(-b+Math.sqrt(D))/(2*a);
	double x2=(-b-Math.sqrt(D))/(2*a);
	
	if (D<0) {
		System.out.println("nema realnih resenja.");
	}else {
		System.out.printf("Rezultat x1 je x1=%.2f i x2=%.2f",x1,x2);
	sc.close();
	}
	}
}
