package src.main.java.console;

import java.util.List;
import java.util.Scanner;

import src.main.java.model.Emprunt;
import src.main.java.model.Livre;
import src.main.java.dao.*;

public class LibrairyAdminAppConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILibraryDao dao = new LibrairyMemDao();
		Scanner questionUser = new Scanner(System.in);
		Integer choiceUser = 0;
	
		while(choiceUser != 99){

			System.out.println("Choississez un option :");
			System.out.println("1. Vous avez l'identifiant du livre");
			System.out.println("2. Vous avez le titre du livre");
			System.out.println("3. Vous voulez voir les livres correspondant à un emprunt");
			System.out.println("4. Vous voulez voir les emprunts d'un client");
			System.out.println("99. Vous voulez sortir");
			choiceUser = questionUser.nextInt();

			switch (choiceUser){
			case 1 :
				System.out.println("Entrez l'identifiant du livre");
				Integer enterId = questionUser.nextInt();
				
				Livre book = new Livre();
				book = dao.findBook(enterId);
				
				if(book != null){
					System.out.println(book.getTitre() + " de : " + book.getAuteur());
				}
			break;

			case 2:
				System.out.println("Entrez le titre du livre");
				String enterTitle = questionUser.next();
				
				Livre bookChoice = new Livre();
				bookChoice = dao.findBookWithTitle(enterTitle);
				
				if(bookChoice != null){
					System.out.println("L'identifiant de " + enterTitle + " écrit par " + bookChoice.getAuteur() + " est : " + bookChoice.getId());
				}
			break;
			
			case 3:
				System.out.println("Choississez l'emprunt qui vous intéresse");
				Integer idEmprunt = questionUser.nextInt();
				Emprunt emprunts = dao.extractEmpruntWithAllBooks(idEmprunt);
				
				if(emprunts != null){
					for(Livre l : emprunts.getLivres()){
						System.out.println(l.getId() + " : " + l.getTitre() + " de " + l.getAuteur());
					}
				}
			break;
				
			case 4 :
				System.out.println("Choississez l'identifiant du client qui vous intéresse");
				Integer idClient = questionUser.nextInt();
				List<Emprunt> empruntClient = dao.extractAllEmpruntOfClient(idClient);
				if (empruntClient != null){
					for (Emprunt e : empruntClient){
						System.out.println("emprunt n°" + e.getId());
					}
				}
			break;
			
			case 99:
				System.out.println("Au Revoir et à bientôt");
			break;
			
			default :
				System.out.println("Votre choix n'est pas correct ! Réessayez !");
			break;
			}
		} 
		questionUser.close();
	}
}
