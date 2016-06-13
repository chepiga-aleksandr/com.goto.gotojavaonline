package ua.goit.goitonline.flowers;

import java.util.List;

public class Flower {
    private List<Rose> roses;
    private List<Daisy> daisy;
    private List<Aster> asters;
    private List<Tulip> tulips;
    private List<Rosebush> rosebushes;

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    public List<Daisy> getDaisy() {
        return daisy;
    }

    public void setDaisy(List<Daisy> daisy) {
        this.daisy = daisy;
    }

    public List<Aster> getAsters() {
        return asters;
    }

    public void setAsters(List<Aster> asters) {
        this.asters = asters;
    }

    public List<Tulip> getTulips() {
        return tulips;
    }

    public void setTulips(List<Tulip> tulips) {
        this.tulips = tulips;
    }

    public List<Rosebush> getRosebushes() {
        return rosebushes;
    }

    public void setRosebushes(List<Rosebush> rosebushes) {
        this.rosebushes = rosebushes;
    }
}
