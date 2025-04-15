class APIUserAdapter implements User {
    private final APIUser apiUser;

    public APIUserAdapter(APIUser apiUser) {
        this.apiUser = apiUser;
    }

    @Override
    public String getName() {
        return apiUser.getFullName();
    }

    @Override
    public String getEmail() {
        return apiUser.getEmailAddress();
    }
}
