package vjezbanje;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private Player player;
	private ArrayList<Enemy> enemies;
	private ArrayList<String> eventLog;

	//konstruktor
	public Game(Player player) {
		if (player == null) {
			throw new IllegalArgumentException("Player ne smije biti null.");
		}
		this.player = player;
		this.enemies = new ArrayList<>();
		this.eventLog = new ArrayList<>();
	}
		
	
	//geteri i seteri
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public List<Enemy> getEnemies() {
		return enemies;
	}

	public void setEnemies(ArrayList<Enemy> enemies) {
		this.enemies = enemies;
	}

	public List<String> getEventLog() {
		return eventLog;
	}

	public void setEventLog(ArrayList<String> eventLog) {
		this.eventLog = eventLog;}

	//provjera sudara
	public boolean checkCollision(Player p, Enemy e) {
	    return p.getX() == e.getX() && p.getY() == e.getY();
	}
	
	//metoda decreaseHealth(Player p, Enemy e)
	public void decreaseHealth(Player p, Enemy e) {
		int stariHealthigraca = p.getHealth();
		int damage = e.getDamage();
		int noviHealthigraca = stariHealthigraca - damage;

    if (noviHealthigraca< 0) {
    	noviHealthigraca = 0;
    }

    p.setHealth(noviHealthigraca);}
	
	//metoda add enemy
	public void addEnemy(Enemy e) {
		enemies.add(e);
		eventLog.add("Dodat neprijatelj: " + e.getType());}

	//metoda findByType(String query), koja pronalazi sve neprijatelje čiji tip sadrži traženi tekst, ne razlikujući velika i mala slova
	public ArrayList<Enemy> findByType(String query) {
		ArrayList<Enemy> result = new ArrayList<>();
		String q = query.toLowerCase();

    for (Enemy e : enemies) {
        if (e.getType().toLowerCase().contains(q)) {
            result.add(e);}}
	return result;
   
	}
	
	//collidingWithPlayer(), koja vraća listu neprijatelja u koliziji sa igračem;
	public ArrayList<Enemy> collidingWithPlayer() {
		ArrayList<Enemy> list = new ArrayList<>();
		for (Enemy e : enemies) {
			if (checkCollision(player, e)) {
				list.add(e);
			}
		}
    return list;
	}
	
	//resolveCollisions(), koja prolazi kroz sve neprijatelje i primjenjuje logiku kolizije i smanjenja zdravlja,bilježeći svaku promjenu u log
	public void resolveCollisions() {
		for (Enemy e : enemies) {
			if (checkCollision(player, e)) {
				decreaseHealth(player, e);}
			}
		}
	}
