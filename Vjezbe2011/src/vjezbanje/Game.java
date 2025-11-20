package vjezbanje;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private Player player;
	private List<Enemy> enemies;
	private List<String> eventLog;

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

	public void setEnemies(List<Enemy> enemies) {
		this.enemies = enemies;
	}

	public List<String> getEventLog() {
		return eventLog;
	}

	public void setEventLog(List<String> eventLog) {
		this.eventLog = eventLog;
	}
	
}
	