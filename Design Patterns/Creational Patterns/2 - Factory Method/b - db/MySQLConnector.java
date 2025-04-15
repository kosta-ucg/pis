// Konkretna klasa koja implementira Factory Method
class MySQLConnector extends DatabaseConnector {
    Connection createConnection() { return new MySQLConnection(); }
}
