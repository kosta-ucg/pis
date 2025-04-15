class Document {
    private DocumentState draftState;
    private DocumentState reviewState;
    private DocumentState publishedState;

    private DocumentState currentState;

    public Document() {
        draftState = new DraftState(this);
        reviewState = new ReviewState(this);
        publishedState = new PublishedState(this);

        currentState = draftState; // Početno stanje je Draft
    }

    public void setState(DocumentState state) {
        this.currentState = state;
    }

    public void edit() {
        currentState.edit();
    }

    public void submitForReview() {
        currentState.submitForReview();
    }

    public void publish() {
        currentState.publish();
    }

    public DocumentState getDraftState() {
        return draftState;
    }

    public DocumentState getReviewState() {
        return reviewState;
    }

    public DocumentState getPublishedState() {
        return publishedState;
    }
}
