class RealDocument implements Document {
    private String content;

    public RealDocument(String content) {
        this.content = content;
    }

    @Override
    public void displayContent() {
        System.out.println("Sadržaj: " + content);
    }

    @Override
    public void editContent(String newContent) {
        this.content = newContent;
        System.out.println("Dokument je ažuriran.");
    }
}
