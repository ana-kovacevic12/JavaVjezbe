package vjezbanje;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble(),b=sc.nextDouble();
	double P=a*b;
	double O=2*(a+b);
	
	System.out.printf("Povrsina je P=%.2f i obim pravougaonika je O=%.2f.",P,O);
	sc.close();
	}

}
