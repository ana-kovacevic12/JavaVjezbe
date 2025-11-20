package vjezbanje;

public class CircleCollider implements Collidable{
	private int centarX;
	private int centarY;
	private int poluprecnikR;

	//konstruktor
	public CircleCollider(int centarX, int centarY, int poluprecnikR) {
		if (poluprecnikR <= 0) 
			throw new IllegalArgumentException("Poluprecnik mora biti veci od nule.");
		this.centarX = centarX;
		this.centarY = centarY;
		this.poluprecnikR = poluprecnikR;}
	
	//geteri i seteri
	public int getCentarX() {
		return centarX;
	}
	public void setCentarX(int centarX) {
		this.centarX = centarX;
	}
	public int getCentarY() {
		return centarY;
	}
	public void setCentarY(int centarY) {
		this.centarY = centarY;
	}
	public int getPoluprecnikR() {
		return poluprecnikR;
	}
	public void setPoluprecnikR(int poluprecnikR) {
		this.poluprecnikR = poluprecnikR;
	}
	
	
	 @Override
	    public String toString() {
	        return "Circle[" + centarX + "," + centarY + ",r=" + poluprecnikR + "]";
	    }
	
	
	//metoda boolean
	@Override
	public boolean intersects(Collidable other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
