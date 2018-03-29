
package ca.medroad.spring.springWeb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Login implements Serializable {

    private final static long serialVersionUID = -2166333695780008961L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;

    /**
     * No args constructor for use in serialization
     */
    public Login() {
    }

    /**
     * @param username
     * @param sha256
     * @param md5
     * @param sha1
     * @param password
     */
    public Login(String username, String password, String md5, String sha1, String sha256) {
        super();
        this.username = username;
        this.password = password;
        this.md5 = md5;
        this.sha1 = sha1;
        this.sha256 = sha256;
    }

}
