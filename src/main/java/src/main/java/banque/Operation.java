package src.main.java.banque;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Operation {
	@Id
	@GeneratedValue
	private Long idOp;
	@Column
	private LocalDateTime date;
	@Column
	private Double montant;
	@Column
	private String motif;
	
	@ManyToOne
	@JoinColumn(name="idCompte", nullable=true)
	private Compte compte;
	
	public Operation(){
		
	}

	public Long getIdOp() {
		return idOp;
	}

	public void setIdOp(Long idOp) {
		this.idOp = idOp;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
}
