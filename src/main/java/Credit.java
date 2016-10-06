
import javax.persistence.*;


@Entity
public class Credit {
    @GeneratedValue
    @Id
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Changes changes;

    private int percent;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    public Credit() {
    }
}
