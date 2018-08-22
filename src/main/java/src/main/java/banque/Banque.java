package src.main.java.banque;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Banque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBanque;
	@Column
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private Set<Client> clients;

	public Banque() {
		
	}
	
	
	public Long getIdBanque() {
		return idBanque;
	}

	public void setIdBanque(Long idBanque) {
		this.idBanque = idBanque;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
}
