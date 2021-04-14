package mk.ukim.finki.emtlibrary.repository;

import mk.ukim.finki.emtlibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    void deleteByName(String name);
}
