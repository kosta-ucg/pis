// Adaptee - pretpostavimo da je ne mozemo mijenjati
class APIUser {
    private final String full_name;
    private final String email_address;

    public APIUser(String full_name, String email_address) {
        this.full_name = full_name;
        this.email_address = email_address;
    }

    public String getFullName() {
        return full_name;
    }

    public String getEmailAddress() {
        return email_address;
    }
}
