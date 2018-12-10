package projet_java2;

public class Varietee extends Oeuvre {
	private int nombreExemplaire;

	public Varietee(String titre, String auteur, int nombreExemplaire) {
		super(titre, auteur);
		this.nombreExemplaire = nombreExemplaire;
	}	
	
	

	public int getNombreExemplaire() {
		return nombreExemplaire;
	}



	public void setNombreExemplaire(int nombreExemplaire) {
		this.nombreExemplaire = nombreExemplaire;
	}



	@Override
	public String toString() {
		return "Varietee : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + ", NombreExemplaire=" + getNombreExemplaire() + "]";
	}

	
}