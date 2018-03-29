
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
public class Billing implements Serializable {

    private final static long serialVersionUID = 497291747250752961L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    /**
     * No args constructor for use in serialization
     */
    public Billing() {
    }

    /**
     * @param card
     */
    public Billing(Card card) {
        super();
        this.card = card;
    }

}
