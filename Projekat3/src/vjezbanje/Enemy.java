package vjezbanje;

public class Enemy extends GameObject{
	private String type;
	private int health;
	private int damage;
	
	//konstruktor
	public Enemy(int x, int y, int width, int height, String type, int health, int damage) {
		super(x, y, width, height);
		this.type = type;
		this.health = health;
		this.damage = damage;
	}
	
		//prikaz enemy
		@Override
		
		public String toString() {
			return String.format("Player[type=%s],@ (%d,%d),%dx%d,DMG=%d,HP=%d",type,super.toString(),getX(),getY(),getWidth(),getHeight(),damage,health);
		}
	//geteri i seteri
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	
	
	//provjera za type
	String type1=type.trim();
	
	if (type1.length()>0){
		
		String type2=type1.toLowerCase();
			
		this.type=type2;
	}else {
		System.out.println("enemy mora imati type.");}}
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	
	
	//provjera za health
		if (health >=0 && health <=100) {
			this.health=health;
			}else {
				System.out.println("health mora biti u opsjegu od 0-100!");}}
		
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	
	//provjera za damage
	if (damage>=0 && damage<=100) {
		this.damage=damage;
		}else {
			System.out.println("damage mora biti u opsjegu od 0-100!");
			}}}

	

