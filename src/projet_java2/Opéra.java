package projet_java2;

public class Op�ra extends Oeuvre {

	public Op�ra(String titre, String auteur, int numeroExemplaire) {
		super(titre, auteur, numeroExemplaire);
	}
	
	@Override
	public String toString() {
		return "Op�ra : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + ", NumeroExemplaire="
				+ getNumeroExemplaire() + "]";
	}
}
