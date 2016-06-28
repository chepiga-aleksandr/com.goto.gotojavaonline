package ua.goit.goitonline.module6;

abstract class MusicInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicInstrument{" + getType() + "}";
    }
}

