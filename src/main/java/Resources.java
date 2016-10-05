import javax.annotation.sql.DataSourceDefinition;

@DataSourceDefinition(name = "java:/DS",
        className = "com.mysql.jdbc.Driver",
        url = "jdbc:mysql://localhost:3306/efs_schema",
        user = "enet",
        password = "555792"
)
public class Resources {
    /*@SuppressWarnings("unused")
    @Produces
    @PersistenceContext
    private EntityManager em;*/
}