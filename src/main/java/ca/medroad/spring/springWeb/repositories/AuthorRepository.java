package ca.medroad.spring.springWeb.repositories;

import ca.medroad.spring.springWeb.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
