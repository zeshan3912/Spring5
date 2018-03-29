
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Job implements Serializable {

    private final static long serialVersionUID = -3550723621412709643L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String company;

    /**
     * No args constructor for use in serialization
     */
    public Job() {
    }

    /**
     * @param title
     * @param company
     */
    public Job(String title, String company) {
        super();
        this.title = title;
        this.company = company;
    }


}
