
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Location implements Serializable {

    private final static long serialVersionUID = 4400674193577559229L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String street;
    private String city;
    private String state;
    private String postcode;

    /**
     * No args constructor for use in serialization
     */
    public Location() {
    }

    /**
     * @param street
     * @param state
     * @param postcode
     * @param city
     */
    public Location(String street, String city, String state, String postcode) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
    }

}
