package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
public class Publisher implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    private Address address;


    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    public Publisher() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;
        if (!super.equals(o)) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(getId(), publisher.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getId());
    }
}
