package vjezbanje;

import java.util.Scanner;

public class OperandOperacijeOperand {

public static int izracunaj(String expr) {
	        expr = expr.trim();  
	        char operator = 0;   
	        int pozicija = -1;  

	        
	        for (int i = 0; i < expr.length(); i++) {
	            char c = expr.charAt(i);
	            if (c == '+' || c == '-' || c == '*' || c == '/') {
	                operator = c;
	                pozicija = i;
	                break;
	            }
	        }

	        if (pozicija== -1) {
	            System.out.println("Operator nije pronađen.");
	            return 0;  
	        }

	       
	        int a = Integer.parseInt(expr.substring(0, pozicija).trim());
	        int b = Integer.parseInt(expr.substring(pozicija + 1).trim());

	        
	        switch (operator) {
	            case '+': return a + b;
	            case '-': return a - b;
	            case '*': return a * b;
	            case '/':
	            	
	                if (b == 0) {
	                    System.out.println("Dijeljenje nulom!");
	                    return 0;
	                } else {
	                    return a / b; 
	                }
	            default:
	                System.out.println("Nepoznat operator.");
	                return 0;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Unesite izraz: ");
	        String expr = sc.nextLine();

	        System.out.println("Rezultat: " + izracunaj(expr));
	        
	        sc.close();
	}

}
