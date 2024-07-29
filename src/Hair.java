public enum Hair {
    HAIRLESS, NA;

    public String toString() {
        return switch (this) {
            case HAIRLESS -> "Airless!";
            case NA -> "No";
        };
    }
}
