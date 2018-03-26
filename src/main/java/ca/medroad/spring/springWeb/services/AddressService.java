package ca.medroad.spring.springWeb.services;

import ca.medroad.spring.springWeb.model.Address;
import ca.medroad.spring.springWeb.repositories.AddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;


    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Transactional
    public Address save(Address address) {
        return addressRepository.save(address);
    }


}
