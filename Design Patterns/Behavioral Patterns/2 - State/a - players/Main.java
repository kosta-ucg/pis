public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.move();
        player.attack();

        System.out.println("Power-up: Invisibility!");
        player.setState(new InvisibleState());
        player.move();
        player.attack();

        System.out.println("Power-up: Invincibility!");
        player.setState(new InvincibleState());
        player.move();
        player.attack();
    }
}
