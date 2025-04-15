// Apstraktna fabrika
interface DatabaseFactory {
    Connection createConnection();
    Query createQuery();
}
