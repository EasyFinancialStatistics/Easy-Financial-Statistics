
import javax.persistence.*;


@Entity
public class Type {
    @GeneratedValue
    @Id
    private int id;
    private String typeName;
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    public Type() {
    }
}
