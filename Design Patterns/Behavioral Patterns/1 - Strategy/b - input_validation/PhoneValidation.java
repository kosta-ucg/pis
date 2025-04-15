class PhoneValidation implements ValidationStrategy {
    public boolean validate(String input) {
        return input.matches("^\\+?[0-9]{9,15}$");
    }
}
