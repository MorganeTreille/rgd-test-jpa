package src.main.java.dao;

import java.util.List;

import src.main.java.model.Emprunt;
import src.main.java.model.Livre;

public interface ILibraryDao {
	Livre findBook(Integer id);
	Livre findBookWithTitle(String title);
	Emprunt extractEmpruntWithAllBooks(Integer idEmprunt);
	List<Emprunt> extractAllEmpruntOfClient(Integer idClient);
}
