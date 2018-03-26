package ca.medroad.spring.springWeb.repositories;

import ca.medroad.spring.springWeb.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
