// Klijent
public class Main {
    public static void main(String[] args) {
        DatabaseConnector connector = new MySQLConnector(); // Ili PostgreSQLConnector
        connector.connect();
    }
}
