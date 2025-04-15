public class Main {
    public static void main(String[] args) {
        // Simulacija dobijanja korisnika iz API-a
        APIUser apiUser = new APIUser("John Doe", "john@example.com");

        // Adapter omogućava korišćenje kao User
        User user = new APIUserAdapter(apiUser);

        System.out.println("Ime: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
}
