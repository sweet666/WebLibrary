package by.safronenko.weblibrary.dao.interfaces;


import by.safronenko.weblibrary.entities.Author;
import by.safronenko.weblibrary.entities.Genre;
import by.safronenko.weblibrary.entities.Book;

import java.util.List;


public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
    Object getFieldValue(Long id, String fieldName);

}
