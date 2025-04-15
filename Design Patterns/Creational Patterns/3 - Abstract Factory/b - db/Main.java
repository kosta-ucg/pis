// Klijent
public class Main {
    public static void main(String[] args) {
        DatabaseFactory factory = new MySQLFactory(); // ili new MongoDBFactory();
        Connection connection = factory.createConnection();
        Query query = factory.createQuery();

        connection.connect();
        query.execute();
    }
}

/**
 * Omogućava lako prebacivanje sa jedne baze podataka na drugu.
 */