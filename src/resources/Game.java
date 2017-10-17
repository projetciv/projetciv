package resources;

import org.apache.log4j.Logger;

import mappers.JoueurMapper;
import util.constantes;

public class Game {
	
	public final static Logger logger = Logger.getLogger(Game.class);
	
	private JoueurMapper joueurs;
	private String status;
	private GameSettings gameSettings;
	private Map map;
	
	public Game(Joueur creator, GameSettings gameSettings) {
		this.joueurs = new JoueurMapper();
		this.joueurs.put(creator);
		
		this.gameSettings = gameSettings;
		
		this.status = constantes.STATUS_WAITING;
	}
	
	public void add(Joueur j) {
		if (!this.status.equals(constantes.STATUS_WAITING)) {
			logger.error("This game cannot be joined because its status is " + this.status);
		}
		else {
			joueurs.put(j);
			if (joueurs.getNbJoueurs() >= gameSettings.nbMaxPlayers) {
				this.status = constantes.STATUS_COMPLETE;
			}	
		}
	}

	public void start() {
		this.status = constantes.STATUS_RUNNING;
		this.map = new Map(gameSettings);
	};
}
