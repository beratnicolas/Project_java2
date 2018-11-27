package projet_java2;

public class Oeuvre {
	private String titre;
	private String auteur;
	
	
	public Oeuvre(String titre, String auteur){
		this.titre = titre;
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	
	@Override
	public String toString() {
		return "Oeuvre : [titre=" + titre + ", auteur=" + auteur + "]";
	}
	

}
