package vjezbanje;

public class Enemy extends GameObject implements Attacker{
	private String type;
	private int damage;
	private int health;

	//konstruktor
	 public Enemy(int x, int y, Collidable c, String type, int damage, int health) {
		super(x, y, c);
		this.type = type;
		this.damage = damage;
		this.health = health;
	 }

	//geteri i seteri
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		//ime neprijatelja
		if (type == null || type.trim().isEmpty()) {
	         throw new IllegalArgumentException("Type neprijatelja ne smije biti prazan.");
	     }
	     this.type = type.trim();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
		//provjera za damage
				if (damage < 0 || damage > 100) 
					throw new IllegalArgumentException("Damage mora biti u opsjegu od 0 do 100.");

	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
		//provjera za health
				if (health < 0 || health > 100) 
					throw new IllegalArgumentException("Health mora biti u opsjegu od 0 do 100.");

	}

//redefinisanje metode
 @Override
 public int getEffectiveDamage() {
	return damage;
 }

 @Override
 public String getDisplayName() {
	return type;
 }

 //metoda tostring
 @Override
 public String toString() {
	return "Enemy [type=" + type + ", damage=" + damage + ", health=" + health + ", getType()=" + getType()
			+ ", getDamage()=" + getDamage() + ", getHealth()=" + getHealth() + ", getEffectiveDamage()="
			+ getEffectiveDamage() + ", getDisplayName()=" + getDisplayName() + ", getCollider()=" + getCollider()
			+ ", getX()=" + getX() + ", getY()=" + getY() + "]";
 }}


