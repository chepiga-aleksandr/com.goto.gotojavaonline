package updateModule3.flowers;

public class Rosebush {

    private int roses;

    public int getRoses() {
        return roses;
    }

    public void setRoses(int roses) {
        this.roses = roses;
    }

    @Override
    public String toString() {
        return "В кусте " + roses + " роз";
    }
}



