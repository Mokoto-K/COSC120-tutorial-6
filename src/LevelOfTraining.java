public enum LevelOfTraining {
    NA, BASIC, INTERMEDIATE, ADVANCED;

    public String toString() {
        return switch (this) {
            case NA -> "No training at all.";
            case BASIC -> "sit, stay, lay down on instruction";
            case INTERMEDIATE -> "play fetch, and will stop barking if instructed.";
            case ADVANCED -> "perform tricks - handshake, play dead, jump over a bar";
        };
    }
}
