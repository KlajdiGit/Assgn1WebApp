package sheridan.hoxhalli.assignment1.assgn1_tvshow.model;

public enum BoxValues {

    NOPRIZE, SPORTCAR, MONEY, MANSION;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
