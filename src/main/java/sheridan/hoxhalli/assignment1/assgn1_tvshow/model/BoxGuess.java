package sheridan.hoxhalli.assignment1.assgn1_tvshow.model;

public class BoxGuess {

    private String prizeText;
    private BoxValues value;

    public BoxGuess(BoxValues value) {
        this.value = value;
        this.prizeText = prizeTextValue();
    }


    public void setPrizeText(String prizeText) {
        this.prizeText = prizeText;
    }

    public void setValue(BoxValues value) {
        this.value = value;
    }

    private String prizeTextValue(){
        switch(this.value){

            case NOPRIZE:
                return "No prize";
            case SPORTCAR:
                return "Sprots car";
            case MONEY:
                return "100,000 Dollars";
            case MANSION:
                return "Mansion";
        }
        throw new AssertionError("should never be reached");
    }

    public String getPrizeText() {
        return prizeText;
    }

    public BoxValues getValue() {
        return value;
    }
}
