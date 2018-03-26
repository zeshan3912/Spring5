package ca.medroad.spring.springWeb.repositories;

import ca.medroad.spring.springWeb.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
