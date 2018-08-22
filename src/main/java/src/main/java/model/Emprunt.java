package src.main.java.model;


import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Emprunt")
public class Emprunt {
	@Id
	private Integer id;
	@Column
	private LocalDateTime DATE_DEBUT;
	@Column
	private LocalDateTime DATE_FIN;
	@Column
	private Integer delai;
	
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	@ManyToMany
	@JoinTable(name="compo",joinColumns = @JoinColumn(name="ID_EMP",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="ID_LIV",referencedColumnName="id"))
	private Set<Livre> livres;
	
	public Emprunt(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDATE_DEBUT() {
		return DATE_DEBUT;
	}

	public void setDATE_DEBUT(LocalDateTime dATE_DEBUT) {
		DATE_DEBUT = dATE_DEBUT;
	}

	public LocalDateTime getDATE_FIN() {
		return DATE_FIN;
	}

	public void setDATE_FIN(LocalDateTime dATE_FIN) {
		DATE_FIN = dATE_FIN;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Livre> getLivres() {
		return livres;
	}

	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

	
}


