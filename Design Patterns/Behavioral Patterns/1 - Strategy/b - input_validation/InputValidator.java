class InputValidator {
    private ValidationStrategy strategy;

    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public void validate(String input) {
        if (strategy == null) {
            System.out.println("No validation strategy set.");
            return;
        }

        if (strategy.validate(input)) {
            System.out.println("Input is valid.");
        } else {
            System.out.println("Input is NOT valid.");
        }
    }
}
