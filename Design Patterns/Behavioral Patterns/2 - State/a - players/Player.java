class Player {
    private PlayerState state;

    public Player() {
        this.state = new NormalState(); // default state
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void move() {
        state.move();
    }

    public void attack() {
        state.attack();
    }
}
