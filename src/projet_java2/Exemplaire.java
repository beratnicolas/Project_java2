package projet_java2;

public class Exemplaire {
	private int numero;
	public boolean dispo = true;
	
	public Exemplaire(int numero) {
		this.numero = numero;
	}
	
	
	
	public boolean isDispo() {
		return dispo;
	}



	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public void ramener(){
		setDispo(true);
	}



//	@Override
//	public String toString() {
//		return "Exemplaire [numero=" + numero + ", titre=" + titre + ", auteur=" + auteur +"]";
//	}
	
	
}
