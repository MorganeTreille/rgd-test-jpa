package src.main.java.banque;

import javax.persistence.*;


public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		AssuranceVie av = new AssuranceVie();
		
		em.persist(av);
		
		et.commit();
		em.close();
	}

}
