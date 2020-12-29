public enum Thoughts {
    HOW_TO_GO_OUT("о том, как выбраться обратно ");
    private final String NAME;
    Thoughts(String name) {
        this.NAME = name;
    }

    public String toString() {
        return NAME;
    }
}
