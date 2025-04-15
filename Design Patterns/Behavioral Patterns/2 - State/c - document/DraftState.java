class DraftState implements DocumentState {
    private Document document;

    public DraftState(Document document) {
        this.document = document;
    }

    @Override
    public void edit() {
        System.out.println("Editing document in Draft state.");
    }

    @Override
    public void submitForReview() {
        System.out.println("Submitting document for review.");
        document.setState(document.getReviewState()); // Prelazimo u Review stanje
    }

    @Override
    public void publish() {
        System.out.println("Cannot publish a draft document. Submit for review first.");
    }
}
