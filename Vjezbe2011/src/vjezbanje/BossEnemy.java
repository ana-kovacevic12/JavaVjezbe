package vjezbanje;

public class BossEnemy extends Enemy{
	 public BossEnemy(String type, int x, int y, Collidable c, int damage, int health) {
	        super(x, y, c,type, damage, health);
	 }


//metoda geteffectivedamage
	 @Override
	 public int getEffectiveDamage() {
		 return getDamage() * 2;
}

	//to string metoda
	 @Override
	 public String toString() {
		return "BossEnemy [getEffectiveDamage()=" + getEffectiveDamage() + ", getType()=" + getType() + ", getDamage()="
				+ getDamage() + ", getHealth()=" + getHealth() + ", getCollider()=" + getCollider() + ", getX()="
				+ getX() + ", getY()=" + getY() + "]";
	 }
}

