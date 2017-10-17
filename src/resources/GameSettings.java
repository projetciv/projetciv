package resources;

import util.constantes;

public class GameSettings {
	
	public int resourceStart;
	public int resourceTurn;
	public int turnTime;
	public int nbMaxPlayers;
	
	public int minDistanceTown;
	public int lengthMap;
	
	public GameSettings(int resourceStart, int resourceTurn, int turnTime, int nbMaxPlayers, int minDistanceTown,
			int lengthMap) {
		super();
		this.resourceStart = resourceStart;
		this.resourceTurn = resourceTurn;
		this.turnTime = turnTime;
		this.nbMaxPlayers = nbMaxPlayers;
		this.minDistanceTown = minDistanceTown;
		this.lengthMap = lengthMap;
	}	
	
	public static GameSettings defaultGameSettings() {
		return new GameSettings(constantes.DEFAULT_resourceStart, 
				constantes.DEFAULT_resourceTurn, 
				constantes.DEFAULT_turnTime, 
				constantes.DEFAULT_nbMaxPlayers, 
				constantes.DEFAULT_minDistanceTown, 
				constantes.DEFAULT_lengthMap);
	}

	public int getResourceStart() {
		return resourceStart;
	}

	public void setResourceStart(int resourceStart) {
		this.resourceStart = resourceStart;
	}

	public int getResourceTurn() {
		return resourceTurn;
	}

	public void setResourceTurn(int resourceTurn) {
		this.resourceTurn = resourceTurn;
	}

	public int getTurnTime() {
		return turnTime;
	}

	public void setTurnTime(int turnTime) {
		this.turnTime = turnTime;
	}

	public int getNbMaxPlayers() {
		return nbMaxPlayers;
	}

	public void setNbMaxPlayers(int nbMaxPlayers) {
		this.nbMaxPlayers = nbMaxPlayers;
	}

	public int getMinDistanceTown() {
		return minDistanceTown;
	}

	public void setMinDistanceTown(int minDistanceTown) {
		this.minDistanceTown = minDistanceTown;
	}

	public int getLengthMap() {
		return lengthMap;
	}

	public void setLengthMap(int lengthMap) {
		this.lengthMap = lengthMap;
	}
}
