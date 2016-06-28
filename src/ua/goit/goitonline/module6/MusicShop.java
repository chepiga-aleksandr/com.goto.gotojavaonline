package ua.goit.goitonline.module6;

class MusicShop {

    int guitars;
    int pianos;
    int trumplets;

    public int getGuitars() {
        return guitars;
    }

    public void setGuitars(int guitars) {
        this.guitars = guitars;
    }

    public int getPianos() {
        return pianos;
    }

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public int getTrumplets() {
        return trumplets;
    }

    public void setTrumplets(int trumplets) {
        this.trumplets = trumplets;
    }

    @Override
    public String toString() {
        return "MusicShop{" +
                "guitars=" + guitars +
                ", pianos=" + pianos +
                ", trumplets=" + trumplets +
                '}';
    }
}

