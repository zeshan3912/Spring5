
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class ExpirationDate implements Serializable {

    private final static long serialVersionUID = 2468720048287740841L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String date;
    private Integer timezoneType;
    private String timezone;

    /**
     * No args constructor for use in serialization
     */
    public ExpirationDate() {
    }

    /**
     * @param timezone
     * @param timezoneType
     * @param date
     */
    public ExpirationDate(String date, Integer timezoneType, String timezone) {
        super();
        this.date = date;
        this.timezoneType = timezoneType;
        this.timezone = timezone;
    }


}
