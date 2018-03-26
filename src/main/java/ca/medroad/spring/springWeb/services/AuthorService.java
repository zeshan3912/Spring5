package ca.medroad.spring.springWeb.services;


import ca.medroad.spring.springWeb.model.Author;
import ca.medroad.spring.springWeb.repositories.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Transactional
    public Author save(Author author) {
        return authorRepository.save(author);
    }


}
