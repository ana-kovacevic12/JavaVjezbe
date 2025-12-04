package vjezbanje;

public abstract class GameObject {
	private int x;
	private int y;
	private Collidable c;
	
	//konstruktor
	
		public GameObject(int x, int y, Collidable c) {
			super();
			this.x = x;
			this.y = y;
			this.c = c;
		}
	//geteri i seteri
	public Collidable getCollider() {
		return c;
	}

	public void setCollider(Collidable c) {
		//izuzetak
		if(c==null) {
			throw new IllegalArgumentException("Collider c ne smije biti null.");
		}
		this.c = c;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	//metoda boolean intersects
	public boolean intersects(GameObject other) {
		if(other==null) {
			throw new IllegalArgumentException("Drugi objekat ne smije biti prazan.");
		}
		return this.c.intersects(other.c);
	}
	
	public abstract String getDisplayName();
	
	
	//metoda tostring
	@Override
	public String toString() {
		return "{'klasa': 'GameObject',Collider ': '" + getCollider() + "' , 'x': '" +  getX() + "' , 'y': '" + getY() + "'}";
	}
	public boolean intersects(Collidable other) {
		// TODO Auto-generated method stub
		return false;
	}}




