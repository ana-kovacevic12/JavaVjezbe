package vjezbanje;
import java.util.Scanner;
public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble(),s=sc.nextDouble();
		double obim=(2*d+2*s);
		System.out.printf("Sportisa pretrci %.2f metara dok obidje teren 4 puta", 4*obim);
		
		sc.close();
	
	}

}
