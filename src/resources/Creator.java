package resources;

public class Creator extends Joueur {

	public Creator(User user, GameSettings gameSettings) {
		super(user);
		this.game = new Game(this, gameSettings);
	}

	public void launch(Game g) {
		g.start();
	}

}
