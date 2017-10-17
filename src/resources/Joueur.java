package resources;

public class Joueur {
	
	protected int id;
	protected User user;
	protected Game game;
	
	public Joueur(User user, Game game) {
		id = 1; // REQUETE SEQUENCE
		this.user = user;
		this.game = game;
	}
	
	public Joueur(User user) {
		id = 1; // REQUETE SEQUENCE
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public Game getGame() {
		return game;
	}
	
	
}
