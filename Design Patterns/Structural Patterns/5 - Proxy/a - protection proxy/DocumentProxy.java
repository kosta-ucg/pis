class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String role; // npr. "admin" ili "guest"

    public DocumentProxy(String content, String role) {
        this.realDocument = new RealDocument(content);
        this.role = role;
    }

    @Override
    public void displayContent() {
        realDocument.displayContent();
    }

    @Override
    public void editContent(String newContent) {
        if (role.equalsIgnoreCase("admin")) {
            realDocument.editContent(newContent);
        } else {
            System.out.println("Nemaš dozvolu za uređivanje dokumenta.");
        }
    }
}
