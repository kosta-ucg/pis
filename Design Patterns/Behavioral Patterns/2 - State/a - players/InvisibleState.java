class InvisibleState implements PlayerState {
    public void move() {
        System.out.println("Player moves silently and unseen.");
    }

    public void attack() {
        System.out.println("Player can't attack while invisible.");
    }
}
