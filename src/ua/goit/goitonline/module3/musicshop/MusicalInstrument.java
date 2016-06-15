package ua.goit.goitonline.module3.musicshop;

import java.util.List;

public class MusicalInstrument {
    private List<Guitar> guitars;
    private List<Piano> pianoes;
    private List<Trumpet> trumpets;

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public List<Piano> getPianoes() {
        return pianoes;
    }

    public void setPianoes(List<Piano> pianoes) {
        this.pianoes = pianoes;
    }

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }
}
