package mk.ukim.finki.emtlibrary.service;

import mk.ukim.finki.emtlibrary.model.Book;
import mk.ukim.finki.emtlibrary.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> save(BookDto bookDto);
    void deleteById(Long id);
    Optional<Book> edit(Long id, BookDto bookDto);
    Optional<Book> changeAvailableCopies(Long bookId);

}
