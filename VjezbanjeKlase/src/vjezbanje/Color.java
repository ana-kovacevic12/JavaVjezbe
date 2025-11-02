package vjezbanje;

public class Color {
	private int red;
	private int green;
	private int blue;
	
	//konstruktor
	public Color(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	
	
	//geteri i seteri
	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
		
		if(red>=0 && red<=255) {
			this.red=red;
		}else {
			System.out.print("vrijednost mora biti u opsjegu izmedju 0-255.");
			
		}
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
		
		if(green>=0 && green<=255) {
			this.green=green;
		}else {
			System.out.print("vrijednost mora biti u opsjegu izmedju 0-255.");
		}
			
		
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
		
		if(blue>=0 && blue<=255) {
			this.blue=blue;
		}else {
			System.out.print("vrijednost mora biti u opsjegu izmedju 0-255.");
		}
	}
	
	//metode add
	public void addRed (int change ) {
		int novaVrijednost=red+change;
		
		if(novaVrijednost<0) {
			red=0;
			System.out.println("vrijednost red postvljena je na nulu");
		}else if(novaVrijednost>255) {
			red=255;
			System.out.println("vrijednost red postavljena je na 255.");
		}else {
			red=novaVrijednost;
		}
		
	}
	public void addGreen (int change ) {
		int novaVrijednost=green+change;
		
		if(novaVrijednost<0) {
			green=0;
			System.out.println("vrijednost green postvljena je na nulu");
		}else if(novaVrijednost>255) {
			green=255;
			System.out.println("vrijednost green postavljena je na 255.");
		}else {
			green=novaVrijednost;
		}
	}
	
		public void addBlue (int change ) {
			int novaVrijednost=red+change;
			
			if(novaVrijednost<0) {
				blue=0;
				System.out.println("vrijednost blue postvljena je na nulu");
			}else if(novaVrijednost>255) {
				blue=255;
				System.out.println("vrijednost blue postavljena je na 255.");
			}else {
				blue=novaVrijednost;
			}
		}
		
		
		
		//ispis boje
		public void stampajBoje() {
		System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
		}
}
