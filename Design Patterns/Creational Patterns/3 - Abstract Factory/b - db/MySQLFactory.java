class MySQLFactory implements DatabaseFactory {
    public Connection createConnection() { return new MySQLConnection(); }
    public Query createQuery() { return new MySQLQuery(); }
}
