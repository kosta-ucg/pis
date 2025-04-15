import java.util.Scanner;

class TwoFactorAuthDecorator extends AuthDecorator {
    public TwoFactorAuthDecorator(Authenticator wrappee) {
        super(wrappee);
    }

    @Override
    public boolean authenticate(String username, String password) {
        boolean basic = super.authenticate(username, password);
        if (basic) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("[2FA] Unesite kod koji ste dobili (npr. 0000): ");
            String inputCode = scanner.nextLine();

            if ("0000".equals(inputCode)) {
                System.out.println("[2FA] Kod ispravan");
                return true;
            } else {
                System.out.println("[2FA] Kod pogrešan");
                return false;
            }
        }
        return false;
    }
}
