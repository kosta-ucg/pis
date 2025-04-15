class RateLimitingDecorator extends AuthDecorator {
    private int attempts = 0;

    public RateLimitingDecorator(Authenticator wrappee) {
        super(wrappee);
    }

    @Override
    public boolean authenticate(String username, String password) {
        if (attempts >= 3) {
            System.out.println("[BLOCKED] Too many attempts!");
            return false;
        }

        boolean result = super.authenticate(username, password);

        if (!result) attempts++;

        return result;
    }
}
