package src.main.java.banque;

import javax.persistence.*;

@Entity
public class LivretA extends Compte{
	
	@Column
	private Double taux;
	
	public LivretA(){
		
	}

	

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
}
