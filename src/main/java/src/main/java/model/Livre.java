package src.main.java.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="livre")
public class Livre {
	@Id
	private Integer id;
	@Column
	private String titre;
	@Column
	private String auteur;
	
	@ManyToMany(mappedBy="livres")
	private Set<Emprunt> emprunt;

	public Livre(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}

}
