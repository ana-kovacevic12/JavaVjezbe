package vjezbanje;

public class Player extends GameObject {
	private String ime;
	private int health;

//konstruktor za ovu klasu
	public Player(int x, int y, Collidable c, String ime, int health) {
		super(x, y, c);
		//provjera za health
		if (health < 0 || health > 100) 
			throw new IllegalArgumentException("Health mora biti u opsjegu od 0 do 100.");

		this.ime = ime;
		this.health = health;}
	
	//geteri i seteri
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
		//provjera za ime i veliko slovo pocetno
				String ime1=ime.trim();{
				
				if (ime1.length()>0){
					String ime2=ime1.substring(0,1).toUpperCase();
					String ime3=ime1.substring(1).toLowerCase();
						
					this.ime=ime2+ime3;
				}else {
					System.out.println("igrac mora imati name.");
				}}

	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	//provjera za ime i veliko slovo pocetno
		String ime1=ime.trim();
		private int width;{
		
		if (ime1.length()>0){
			String ime2=ime1.substring(0,1).toUpperCase();
			String ime3=ime1.substring(1).toLowerCase();
				
			this.ime=ime2+ime3;
		}else {
			System.out.println("igrac mora imati name.");
		}}

		//provjera za sudar pravougaonika
		private boolean intersectsRectangle(RectangleCollider other) {
	        return this.getX() < other.getX() + other.getWidth() &&
	               this.getX() + this.width > other.getX() &&
	               this.getY() < other.getY() + other.getHeight() &&
	               this.getY() + this.health > other.getY();
	              
	    
	    }
		//metoda getdisplayname
		 @Override
		    public String getDisplayName() {
		        return ime;
		    }
		 
		 
		 //metoda tostring
		 @Override
		 public String toString() {
			return "Player [ime=" + ime + ", health=" + health + ", ime1=" + ime1 + ", getIme()=" + getIme()
					+ ", getHealth()=" + getHealth() + ", getDisplayName()=" + getDisplayName() + ", getCollider()="
					+ getCollider() + ", getX()=" + getX() + ", getY()=" + getY() + "]";
		 }}
	

	

	