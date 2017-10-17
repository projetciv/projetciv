package resources;

import java.util.ArrayList;
import java.util.List;

public class User {

	private List<Joueur> joueurs;
	private String login;
	
	public User(String login) {
		super();
		this.joueurs = new ArrayList<Joueur>();
		this.login = login;
	}	
	
	public void createGame(GameSettings gameSettings) {
		Creator c = new Creator(this, gameSettings);
		joueurs.add(c);
	}
	
	public void joinGame(Game g) {
		Joueur j = new Joueur(this, g);
		joueurs.add(j);
	}
	
	public String getLogin() {
		return login;
	}
	
}
