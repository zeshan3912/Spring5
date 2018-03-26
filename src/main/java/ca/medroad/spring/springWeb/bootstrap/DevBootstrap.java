package ca.medroad.spring.springWeb.bootstrap;


import ca.medroad.spring.springWeb.model.Address;
import ca.medroad.spring.springWeb.model.Author;
import ca.medroad.spring.springWeb.model.Book;
import ca.medroad.spring.springWeb.model.Publisher;
import ca.medroad.spring.springWeb.services.AddressService;
import ca.medroad.spring.springWeb.services.AuthorService;
import ca.medroad.spring.springWeb.services.BookService;
import ca.medroad.spring.springWeb.services.PublisherService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorService authorService;
    private BookService bookService;
    private PublisherService publisherService;
    private AddressService addressService;


    public DevBootstrap(AuthorService authorService, BookService bookService, PublisherService publisherService, AddressService addressService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.publisherService = publisherService;
        this.addressService = addressService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {

        Author eric = new Author("Eric", "Evans");

        Address harperAddress = new Address("1234", "LA", "74564", "USA");
        Publisher harper = new Publisher("Harper Collins", harperAddress);

        Book domainDrivenDesignBook = new Book("Domain driven Design", "456465", harper);
        eric.getBooks().add(domainDrivenDesignBook);
        domainDrivenDesignBook.getAuthors().add(eric);

        authorService.save(eric);
        addressService.save(harperAddress);
        publisherService.save(harper);
        bookService.save(domainDrivenDesignBook);

        Author rod = new Author("Rod", "Johnson");

        Address worxAddress = new Address("44654", "af", "asdfa", "adf");
        Publisher worx = new Publisher("worx", worxAddress);

        Book ejb = new Book("J2EE Development", "4864543", worx);
        eric.getBooks().add(ejb);
        ejb.getAuthors().add(rod);

        authorService.save(rod);
        addressService.save(worxAddress);
        publisherService.save(worx);
        bookService.save(ejb);

    }


}
