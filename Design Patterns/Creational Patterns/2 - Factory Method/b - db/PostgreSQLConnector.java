// Konkretna klasa koja implementira Factory Method
class PostgreSQLConnector extends DatabaseConnector {
    Connection createConnection() { return new PostgreSQLConnection(); }
}
