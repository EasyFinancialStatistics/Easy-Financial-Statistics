package Entity;

import javax.persistence.*;

@Entity
public class Consumption {
    @GeneratedValue
    @Id
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Changes changes;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Type type;

    public Consumption() {
    }
}
