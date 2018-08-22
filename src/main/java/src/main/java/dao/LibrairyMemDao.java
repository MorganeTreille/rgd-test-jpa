package src.main.java.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import src.main.java.model.Emprunt;
import src.main.java.model.Livre;

public class LibrairyMemDao implements ILibraryDao{
	
	public LibrairyMemDao() {
		
	}

	@Override
	public Livre findBook(Integer id) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lyon-rgd-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();

		Livre book = em.find(Livre.class, id);
		return book;
	}

	@Override
	public Livre findBookWithTitle(String title) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lyon-rgd-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		TypedQuery<Livre> book = em.createQuery("Select livre from Livre livre where livre.titre = :title",Livre.class);
		book.setParameter("title", title);
	
		return book.getSingleResult();
	}

	@Override
	public Emprunt extractEmpruntWithAllBooks(Integer idEmprunt) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lyon-rgd-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		TypedQuery<Emprunt> allBooks = em.createQuery("Select e from Emprunt e where e.id = :id",Emprunt.class);
		allBooks.setParameter("id", idEmprunt);
		Emprunt empruntChoice = allBooks.getSingleResult();	
		
		return empruntChoice;
	}

	@Override
	public List<Emprunt> extractAllEmpruntOfClient(Integer idClient) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lyon-rgd-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		TypedQuery<Emprunt> allEmprunt = em.createQuery("Select e from Emprunt e where e.client.id = :id",Emprunt.class);
		allEmprunt.setParameter("id", idClient);
		return allEmprunt.getResultList();
	}

}
