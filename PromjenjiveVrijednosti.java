package vjezbanje;

import java.util.Scanner;

public class PromjenjiveVrijednosti {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		
		double x1=y;
		double y1=x;
		
		System.out.println("x je sada: " + x1 + ",a y je sada" + y1);
		
		sc.close();

	}

}
