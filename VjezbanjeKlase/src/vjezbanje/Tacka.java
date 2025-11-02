package vjezbanje;

public class Tacka {
	private int x;
	private int y;
	
	
	public Tacka(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public void ispisi() {
		System.out.println("Tacka se nalazi na koordinatama :x koordinata- " + x + ",y-koordinata: " + y);}
	}
	

