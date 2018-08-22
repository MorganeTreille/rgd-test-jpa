package src.main.java.banque;

import javax.persistence.*;

@Entity
public class Virement extends Operation{
	
	@Column
	private String beneficiaire;
	
	public Virement(){
		
	}

	

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
}
