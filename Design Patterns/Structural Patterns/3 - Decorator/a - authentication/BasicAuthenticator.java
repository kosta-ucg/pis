class BasicAuthenticator implements Authenticator {
    @Override
    public boolean authenticate(String username, String password) {
        // hardcoded samo za primjer
        return "admin".equals(username) && "1234".equals(password);
    }
}
