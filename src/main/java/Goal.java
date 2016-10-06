package Entity;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Goal {
    @GeneratedValue @Id
    private int id;
    private String name;
    private int price;
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    public Goal() {
    }
}
