package projet_java2;

public class Pret {
	private int numero;
	private String debut; //date
	private String fin; //date

	public Pret(int numero, String debut, String fin) {
		this.numero = numero;
		this.debut = debut;
		this.fin = fin;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	
	

}
