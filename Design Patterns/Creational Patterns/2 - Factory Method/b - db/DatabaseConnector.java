// Apstraktna klasa sa Factory Method
abstract class DatabaseConnector {
    abstract Connection createConnection(); // Factory Method

    void connect() { // zajednička logika
        Connection connection = createConnection();
        connection.open();
    }
}
