package mappers;

import resources.Joueur;

public class JoueurMapper {
	
	IdMap<Joueur> idmap = new IdMap<Joueur>();
	
	public JoueurMapper() {}
	
	public Joueur find(int id) {
		
		Joueur j = idmap.get(id);
		if (j != null) 
			return j;
		
		//... recuperer les champs avec la requete SQL);
		//j = new Joueur();
				
		idmap.put(id, j);
		return j;
	}
	
	public void put(Joueur j) {
		idmap.put(j.getId(), j);
	}

	public int  getNbJoueurs() {
		return idmap.getNb();
	}	
}
