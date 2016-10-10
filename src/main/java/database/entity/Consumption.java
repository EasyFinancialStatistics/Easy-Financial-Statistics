package database.entity;

import javax.persistence.*;

@Entity
public class Consumption implements Table{
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Changes getChanges() {
        return changes;
    }

    public void setChanges(Changes changes) {
        this.changes = changes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
