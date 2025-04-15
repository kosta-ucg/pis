abstract class AuthDecorator implements Authenticator {
    protected Authenticator wrappee;

    public AuthDecorator(Authenticator wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return wrappee.authenticate(username, password);
    }
}
