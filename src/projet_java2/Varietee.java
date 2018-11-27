package projet_java2;

public class Varietee extends Oeuvre {
	private String titre = getTitre();
	private String auteur = getAuteur();
	private int nombreExemplaire;
	private Exemplaire exemplaire = new Exemplaire(titre, auteur, nombreExemplaire);

	public Varietee(String titre, String auteur, int nombreExemplaire) {
		super(titre, auteur);
		nombreExemplaire = exemplaire.getNumero();
	}	


	@Override
	public String toString() {
		return "Varietee : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + ", NombreExemplaire=" + nombreExemplaire + "]";
	}

	
}