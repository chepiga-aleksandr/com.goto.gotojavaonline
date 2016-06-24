package animal;

class PetShop {
    int dogs;
    int cats;

    public int getCats() {
        return cats;
    }

    public void setCats(int cats) {
        this.cats = cats;
    }

    public int getDogs() {
        return dogs;
    }

    public void setDogs(int dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "dogs=" + dogs +
                ", cats=" + cats +
                '}';
    }
}