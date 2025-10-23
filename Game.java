package vjezbanje;
//Luka Mijanovic 24/074,Ana Kovacevic 24/075

import java.util.ArrayList;

//atributi
class Player {
	private String ime;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	

//konstruktor
public Player(String ime,int x,int y,int width,int height,int health) {
	this.ime=ime;
	this.x= x;
	this.y= y;
	this.width=width;
	this.height=height;
	this.health=health;}


	@Override
	public String toString() {
		return String.format("Player[ime=%s],@ (%d,%d),%dx%d,HP=%d",ime,x,y,width,height,health);
	}

//geteri
	public String getIme() {return ime;}
	public int getX() {return x;}
	public int getY() {return y;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public int getHealth() {return health;}

//seteri
	
	public void setIme(String ime) {
		String ime1=ime.trim();
		
		if (ime1.length()>0) {
			this.ime=ime1;
		}else {
			System.out.println("igrac mora imati ime.");
		}
	}
	
	//seteri
	public void setX(int x) {this.x= x;}
	public void setY(int y) {this.y=y;}
	public void setWidth(int width) {this.width=width;}
	public void setHeight(int height) {this.height=height;}
	public void setHealth(int health) {
		if (health >=0 && health <=100) {
			this.health=health;
			}else {
				System.out.println("health mora biti u opsjegu od 0-100!");}}}
	
	

class Enemy{
	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	//konstruktor
	public Enemy(String type,int x,int y,int width,int height,int damage) {
		this.type=type;
		this.x= x;
		this.y= y;
		this.width=width;
		this.height=height;
		this.damage=damage;}
	
	@Override
	public String toString() {
		return String.format("Enemy[ime=%s],@ (%d,%d),%dx%d,DMG=%d",type,x,y,width,height,damage);
	}
	
	
	
	
	//geteri
	public String getType() {return type;}
	public int getX() {return x;}
	public int getY() {return y;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public int getDamage() {return damage;}
	
	
	//seteri
	public void setType(String Type) {
		String type1=type.trim();
		
		if (type1.length()>0) {
			this.type=type1;
		}else {
			System.out.println("enemy mora imati type.");
		}
	}
	public void setX(int x) {this.x= x;}
	public void setY(int y) {this.y=y;}
	public void setWidth(int width) {this.width=width;}
	public void setHeight(int height) {this.height=height;}
	public void setDemage(int damage) {
		if (damage >=0 && damage <=100) {
			this.damage=damage;
			}else {
				System.out.println("demage mora biti u opsjegu od 0-100!");}}}

//klasa game
public class Game {
	public Player player;
	public ArrayList<Enemy>enemies;
	public ArrayList<String>eventLog;
	
	
	//konstruktor
	public Game() {
		this.player=null;
		this.enemies=new ArrayList<Enemy>();
		this.eventLog=new ArrayList<String>();}
	
	
	
	//provjera sudara
	public static boolean checkCollision (Player p,Enemy e) {
		return (p.getX()< e.getX() + e.getWidth() && p.getX() +p.getWidth()> e.getX() && p.getY() <e.getY() +e.getHeight() && p.getY() + p.getHeight() > e.getY());}

	//ako ima sudara,smanji health
	public static void decreaseHealth(Player p,Enemy e) {
		if(checkCollision(p,e)) {
			int novoHealth =p.getHealth() - e.getDamage();
				if(novoHealth <0) novoHealth =0;
					p.setHealth(novoHealth);
			System.out.println("kolizija ! Health smanjen na:" + p.getHealth());}}}




	
	
	

	
		


			
	

