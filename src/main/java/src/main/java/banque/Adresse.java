package src.main.java.banque;

import javax.persistence.*;

@Embeddable
public class Adresse {
	
	@Column
	private Integer numero;
	@Column
	private String rue;
	@Column
	private Integer codePostale;
	@Column
	private String ville;
	
	public Adresse() {
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public Integer getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(Integer codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
