package projet_java2;

public class Opera extends Oeuvre {

	public Opera(String titre, String auteur) {
		super(titre, auteur);
	}
	
	public String type() {
		return "Opera";
	}
	
	@Override
	public String toString() {
		return "Opera : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + "]";
	}
}
