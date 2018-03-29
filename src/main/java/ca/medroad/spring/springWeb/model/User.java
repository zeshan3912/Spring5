
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    private final static long serialVersionUID = -8559054099904421964L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String gender;

    private Name name;

    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Login login;

    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Job job;

    @OneToOne(cascade = CascadeType.ALL)
    private Billing billing;

    private String language;
    private String currency;

    /**
     * No args constructor for use in serialization
     */
    public User() {
    }

    /**
     * @param billing
     * @param phone
     * @param email
     * @param location
     * @param name
     * @param job
     * @param gender
     * @param login
     * @param language
     * @param currency
     */
    public User(String gender, Name name, Location location, String email, Login login, String phone, Job job, Billing billing, String language, String currency) {
        super();
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.phone = phone;
        this.job = job;
        this.billing = billing;
        this.language = language;
        this.currency = currency;
    }

}
