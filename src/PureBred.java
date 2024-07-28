public enum PureBred {
    YES, NO, NA;

    public String toString() {
        return switch (this) {
            case YES -> "Pure Bred";
            case NO -> "Mutt";
            case NA -> "";
        };
    }
}
