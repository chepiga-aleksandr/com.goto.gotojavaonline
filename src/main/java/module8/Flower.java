package module8;

class Flower {
    String name, colour;
    int count;

    public Flower(String name, String colour, int count) {
        this.name = name;
        this.colour = colour;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\n" + name + "\t" + colour + "\t " + count;
    }
}


