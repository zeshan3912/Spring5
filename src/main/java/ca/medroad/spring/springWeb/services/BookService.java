package ca.medroad.spring.springWeb.services;

import ca.medroad.spring.springWeb.model.Book;
import ca.medroad.spring.springWeb.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Transactional
    public Book save(Book book) {
        return bookRepository.save(book);
    }


}
