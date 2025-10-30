//Luka Mijanovic 24/074,Ana Kovacevic 24/075
//https://github.com/ana-kovacevic12
package vjezbanje;

public class GameObject {
	private int x;
	private int y;
	private int width;
	private int height;
	
	//konstruktor za ovu klasu
	public GameObject(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
	@Override
	public String toString() {
		return "GameObject @ (x=" + x + ", y=" + y + "), width=" + width + "x height=" + height ;
	}


	//geteri i seteri
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	
	//provjera za sirinu
	if (width >=0) {
		this.width=width;
		}else {
			System.out.println("width mora biti vece od nule");}}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	
	
	//provjera za height
	if (height >=0) {
		this.height=height;
		}else {
			System.out.println("height mora biti vece od nule");}}
	
	

 	//provjera kolizije
	public static boolean checkCollision (Player p,Enemy e) {
		return (p.getX()< e.getX() + e.getWidth() && p.getX() +p.getWidth()> e.getX() && p.getY() <e.getY() +e.getHeight() && p.getY() + p.getHeight() > e.getY());}}

