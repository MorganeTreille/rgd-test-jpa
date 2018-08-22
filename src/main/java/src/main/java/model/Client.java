package src.main.java.model;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Client")
public class Client {
	@Id 
	private Integer id;
	@Column
	private String nom;
	@Column
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunt;
		
	public Client(){
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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

	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}
	
}
