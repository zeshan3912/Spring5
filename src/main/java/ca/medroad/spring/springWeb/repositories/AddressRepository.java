package ca.medroad.spring.springWeb.repositories;

import ca.medroad.spring.springWeb.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
