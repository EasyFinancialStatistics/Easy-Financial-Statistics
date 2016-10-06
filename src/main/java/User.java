
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
    @GeneratedValue @Id
    private int id;
    private String login;
    private String password;

    public User() {
    }
}
