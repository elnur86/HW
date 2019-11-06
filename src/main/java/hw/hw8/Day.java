package hw.hw8;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;

    @Override
    public String toString() {
        switch(this) {
            case SUNDAY: return "Relax";
            case MONDAY: return "Do HomeWork for Tuesday";
            case TUESDAY: return "Class at Bayil Plaza";
            case WEDNESDAY: return "Do HomeWork for Thursday";
            case THURSDAY: return "Class at Bayil Plaza";
            case FRIDAY: return "Do HomeWork for Saturday";
            case SATURDAY: return "Class at Bayil Plaza and Relax";
            default: throw new IllegalArgumentException();
        }
    }
}
