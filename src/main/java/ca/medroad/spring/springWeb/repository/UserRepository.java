package ca.medroad.spring.springWeb.repository;

import ca.medroad.spring.springWeb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
