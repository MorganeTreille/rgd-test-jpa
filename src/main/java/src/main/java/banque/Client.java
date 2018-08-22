package src.main.java.banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private LocalDate dateNaissance;
	@Embedded
	private Adresse adresse;
	
	@ManyToOne
	@JoinColumn(name="idBanque")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(name="ComptesClients",joinColumns=@JoinColumn(name="idClient",referencedColumnName="idClient"),
	inverseJoinColumns=@JoinColumn(name="idCompte",referencedColumnName="idCompte"))
	private Set<Compte> comptes;
	
	
	public Client() {
		
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Set<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}
}
