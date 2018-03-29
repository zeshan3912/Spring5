
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Name implements Serializable {

    private final static long serialVersionUID = -7816568602782075642L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String first;
    private String last;

    /**
     * No args constructor for use in serialization
     */
    public Name() {
    }

    /**
     * @param title
     * @param last
     * @param first
     */
    public Name(String title, String first, String last) {
        super();
        this.title = title;
        this.first = first;
        this.last = last;
    }

}
