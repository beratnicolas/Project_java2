package projet_java2;

public class Opera extends Oeuvre {

	public Opera(String titre, String auteur) {
		super(titre, auteur);
	}
	
	@Override
	public String toString() {
		return "Op�ra : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + "]";
	}
}
