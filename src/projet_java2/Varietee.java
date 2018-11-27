package projet_java2;

public class Varietee extends Oeuvre {
	private Exemplaire exemplaire;

	public Varietee(String titre, String auteur, int nombreExemplaire) {
		super(titre, auteur);
		nombreExemplaire = exemplaire.getNumero();
	}	


	@Override
	public String toString() {
		return "Varietee : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + ", NombreExemplaire=" + exemplaire.getNumero() + "]";
	}

	
}