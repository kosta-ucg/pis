public class Main {
    public static void main(String[] args) {
        Authenticator auth = new BasicAuthenticator();
        auth = new LoggingAuthDecorator(auth);
        auth = new RateLimitingDecorator(auth);
        auth = new TwoFactorAuthDecorator(auth);

        System.out.println("Auth result: " + auth.authenticate("admin", "1234"));
        System.out.println("Auth result: " + auth.authenticate("admin", "wrong"));
        System.out.println("Auth result: " + auth.authenticate("admin", "wrong"));
        System.out.println("Auth result: " + auth.authenticate("admin", "wrong"));
        System.out.println("Auth result: " + auth.authenticate("admin", "1234"));
    }
}
