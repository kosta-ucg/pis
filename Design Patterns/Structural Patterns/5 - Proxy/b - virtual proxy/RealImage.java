class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Učitavam sliku sa diska: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Prikazujem sliku: " + filename);
    }
}
