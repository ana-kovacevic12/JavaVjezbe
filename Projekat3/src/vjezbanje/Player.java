package vjezbanje;

public class Player extends GameObject{
	private String name;
	private int health;
	
	//konstruktor za ovu klasu
	public Player(int x, int y, int width, int height, String name, int health) {
		super(x, y, width, height);
		this.name = name;
		this.health = health;
	}
	
	
	//prikaz igraca
	@Override
	
	public String toString() {
		return String.format("Player[name=%s],@ (%d,%d),%dx%d,HP=%d",name,super.toString(),getX(),getY(),getWidth(),getHeight(),health);
	}

	//geteri i seteri
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	
	//provjera za ime i veliko slovo pocetno
	String name1=name.trim();
	
	if (name1.length()>0){
		String name2=name1.substring(0,1).toUpperCase();
		String name3=name1.substring(1).toLowerCase();
			
		this.name=name2+name3;
	}else {
		System.out.println("igrac mora imati name.");
	}
}
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
	}

	
	

