class EmailValidation implements ValidationStrategy {
    public boolean validate(String input) {
        return input.matches("^[\\w-.]+@[\\w-]+\\.[a-z]{2,}$");
    }
}