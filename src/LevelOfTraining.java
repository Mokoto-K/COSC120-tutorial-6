public enum LevelOfTraining {
    NA, BASIC, INTERMEDIATE, ADVANCED;

    public String toString() {
        return switch (this) {
            case NA -> "None";
            case BASIC -> "Basic";
            case INTERMEDIATE -> "Intermediate";
            case ADVANCED -> "Advanced";
        };
    }
}
