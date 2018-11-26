package projet_java2;

public class Oeuvre {
	private String titre;
	private String auteur;
	private int numeroExemplaire;
	private Exemplaire ex = new Exemplaire(titre, auteur, numeroExemplaire);
	
	public Oeuvre(String titre, String auteur, int numeroExemplaire){
		numeroExemplaire = ex.getNumero();
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
	
	

}
