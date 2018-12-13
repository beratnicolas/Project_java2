package projet_java2;

public class Opera extends Oeuvre {

	public Opera(String titre, String auteur, int nombreExemplaire) {
		super(titre, auteur, nombreExemplaire);
	}
	
	@Override
	public String toString() {
		return "Opera : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + "]";
	}
}
