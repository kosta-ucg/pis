class PublishedState implements DocumentState {
    private Document document;

    public PublishedState(Document document) {
        this.document = document;
    }

    @Override
    public void edit() {
        System.out.println("Cannot edit a published document.");
    }

    @Override
    public void submitForReview() {
        System.out.println("Document is already published. Cannot submit for review.");
    }

    @Override
    public void publish() {
        System.out.println("Document is already published.");
    }
}
