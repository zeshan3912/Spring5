package ca.medroad.spring.springWeb.services;

import ca.medroad.spring.springWeb.model.Publisher;
import ca.medroad.spring.springWeb.repositories.PublisherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PublisherService {

    private PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Transactional
    public List<Publisher> getPublishers() {
        return publisherRepository.findAll();
    }

    @Transactional
    public Publisher save(Publisher publisher) {
        return publisherRepository.save(publisher);
    }


}
