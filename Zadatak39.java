package vjezbanje;

import java.util.Scanner;

public class Zadatak39 {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Unesite X koordinatu donjeg lijevog tjemena stola: ");
			int x1 = sc.nextInt();
			
			System.out.print("Unesite Y koordinatu donjeg lijevog tjemena stola: ");
			int y1 = sc.nextInt();
			
			System.out.print("Unesite X koordinatu gornjeg desnog tjemena stola: ");
			int x2 = sc.nextInt();
			
			System.out.print("Unesite Y koordinatu gornjeg desnog tjemena stola: ");
			int y2 = sc.nextInt();
			
			System.out.print("Unesite broj mrava: ");
			int n = sc.nextInt();
			
			int brojNaIvici = 0;
			System.out.println("Unesite koordinate mrava (x y):");
			
			for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			boolean naIvici = (x == x1 && y >= y1 && y <= y2) || (x == x2 && y >= y1 && y <= y2) || (y == y1 && x >= x1 && x <= x2) || (y == y2 && x >= x1 && x <= x2);
			
			if (naIvici) {
				brojNaIvici++;
			System.out.println("Mrav " + i + " je na ivici: (" + x + ", " + y + ")");
				}
			}
			System.out.println("Ukupno mrava na ivici: " + brojNaIvici);
			
			sc.close();
				}
			
	}


