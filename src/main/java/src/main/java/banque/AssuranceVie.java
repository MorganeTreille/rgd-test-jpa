package src.main.java.banque;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class AssuranceVie extends Compte{
	
	@Column
	private LocalDate dateFin;
	@Column
	private Double taux;
	
	public AssuranceVie(){
		
	}

	

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
}
