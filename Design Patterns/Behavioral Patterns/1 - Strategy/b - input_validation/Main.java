public class Main {
    public static void main(String[] args) {
        InputValidator validator = new InputValidator();

        validator.setStrategy(new EmailValidation());
        validator.validate("test@example.com");

        validator.setStrategy(new PhoneValidation());
        validator.validate("12345");
    }
}
