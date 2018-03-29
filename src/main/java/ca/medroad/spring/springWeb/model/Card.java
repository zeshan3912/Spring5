
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Card implements Serializable {

    private final static long serialVersionUID = -2099871841841689924L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;

    /**
     * No args constructor for use in serialization
     */
    public Card() {
    }

    /**
     * @param expirationDate
     * @param number
     * @param type
     * @param swift
     * @param iban
     */
    public Card(String type, String number, ExpirationDate expirationDate, String iban, String swift) {
        super();
        this.type = type;
        this.number = number;
        this.expirationDate = expirationDate;
        this.iban = iban;
        this.swift = swift;
    }


}
