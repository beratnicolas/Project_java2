package projet_java2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pret {
	private int numero;
	private LocalDate debut; //date
	private LocalDate fin; //date

	public Pret(LocalDate debut) {
		this.debut = debut;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDebut() {
		return debut;
	}

	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	
	public static LocalDate date_now() {
		return LocalDate.now();
	}
	
	public long date_diff(LocalDate debut, LocalDate fin) {
		return ChronoUnit.DAYS.between(fin , debut);
	}
	
	public boolean depasse_fin() {
		if (date_diff(this.fin, this.debut) < date_diff(date_now(), this.debut)) {
			return true;
		}
		return false;
	}

}
