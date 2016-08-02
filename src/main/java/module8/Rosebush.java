package module8;

import java.util.Map;

public class Rosebush {

    private int roses;

    public int getRoses() {
        return roses;
    }

    public Map setRoses(int roses) {
        this.roses = roses;
        return null;
    }

    @Override
    public String toString() {
        return "В кусте " + roses + " роз";
    }
}



