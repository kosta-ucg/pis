class LoggingAuthDecorator extends AuthDecorator {
    public LoggingAuthDecorator(Authenticator wrappee) {
        super(wrappee);
    }

    @Override
    public boolean authenticate(String username, String password) {
        System.out.println("[LOG] Attempt by: " + username);
        return super.authenticate(username, password);
    }
}
