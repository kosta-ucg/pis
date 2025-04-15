class MongoDBFactory implements DatabaseFactory {
    public Connection createConnection() { return new MongoDBConnection(); }
    public Query createQuery() { return new MongoDBQuery(); }
}
