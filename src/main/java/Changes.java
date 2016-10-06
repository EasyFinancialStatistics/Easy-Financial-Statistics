package Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Changes {
    @GeneratedValue
    @Id
    private int id;
    private int amount;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.DATE)
    private Date beginDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;

    public Changes() {
    }
}
