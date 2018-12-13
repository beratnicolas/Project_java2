package projet_java2;

public class Varietee extends Oeuvre {

	public Varietee(String titre, String auteur, int nombreExemplaire) {
		super(titre, auteur, nombreExemplaire);
	}	


	@Override
	public String toString() {
		return "Varietee : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + ", NombreExemplaire=" + getNbex() + "]";
	}

	
}