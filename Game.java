package vjezbanje;

class Player {
	private int x,y;
	private int width,height;
	private int health;
			
	public Player(int x,int y,int width,int height,int health) {
		this.x= x;
		this.y= y;
		this.width=width;
		this.height=height;
		this.health=health;}
			
	//geteri
	public int getX() {return x;}
	public int getY() {return y;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public int getHealth() {return health;}
			
	//seteri
	public void setX(int x) {this.x= x;}
	public void setY(int y) {this.y=y;}
	public void setWidth(int width) {this.width=width;}
	public void setHeight(int height) {this.height=height;}
	public void setHealth(int health) {
		if (health >=0 && health <=100) {
			this.health=health;
			}else {
				System.out.println("health mora biti u opsjegu od 0-100!");}}
			
	//ispis
	public void ispisi() {
		System.out.println("Player na(" + x + " , " + y + "), health: " + health);}}


class Enemy {
	private int x,y;
	private int width,height;
	private int damage;
			
	//atributi
	public Enemy(int x,int y,int width,int height,int damage) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.damage=damage;
	}
			
	//geteri
	public int getX() {return x;}
	public int getY() {return y;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public int getdDamage() {return damage;}
			
	//seteri
	public void setX(int x) {this.x=x;}
	public void setY(int y) {this.y=y;}
	public void setWidth(int width) {this.width=width;}
	public void setHeight (int height) {this.height= height;}
	public void setDamage(int damage) {
		if(damage>=0 && damage<=100) {
			this.damage=damage;
		}else {
			System.out.println("Damage mora biti u opsjegi 0-100!");}}
			
	//ispisi
	public void ispisi() { 
		System.out.println("Enemy na(" + x + "," + y + "),damage: " + damage);}};

	public class Game {
				
	//provjera kolizije
	public static boolean checkCollision (Player p,Enemy e) {
		return (p.getX()< e.getX() + e.getWidth() && p.getX() +p.getWidth()> e.getX() && p.getY() <e.getY() +e.getHeight() && p.getY() + p.getHeight() > e.getY());
				}
				
	//ako ima kolizije/sudara,smanji health 
	public static void decreaseHealth(Player p,Enemy e) {
		if(checkCollision(p,e)) {
		int novoHealth =p.getHealth() - e.getdDamage();
		if(novoHealth <0) novoHealth =0;
			p.setHealth(novoHealth);
				System.out.println("kolizija ! Health smanjen na:" + p.getHealth());}}
					
			
	//testiranje 
	public static void main (String [] args) {
		Player igrac=new Player (10,10,20,20,100);
		Enemy neprijatelj1=new Enemy(15,15,20,20,30);
		Enemy neprijatelj2=new Enemy(100,100,20,20,40);
				
		igrac.ispisi();
		neprijatelj1.ispisi();
		neprijatelj2.ispisi();
				
	//test sudara
		decreaseHealth(igrac,neprijatelj1);//sudar->health smanjuje
		decreaseHealth(igrac,neprijatelj2);//nema sudara-> nista
		igrac.ispisi();
			}			
}

	


