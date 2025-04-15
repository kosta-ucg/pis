class ReviewState implements DocumentState {
    private Document document;

    public ReviewState(Document document) {
        this.document = document;
    }

    @Override
    public void edit() {
        System.out.println("Editing document in Review state.");
        document.setState(document.getDraftState()); // Vraćamo se u Draft da bi se uređivao
    }

    @Override
    public void submitForReview() {
        System.out.println("Document is already in review.");
    }

    @Override
    public void publish() {
        System.out.println("Publishing document.");
        document.setState(document.getPublishedState()); // Prelazimo u Published stanje
    }
}
