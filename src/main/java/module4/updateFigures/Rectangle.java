package module4.updateFigures;

class Rectangle extends Figure {
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getFigureType() {
        return this.getClass().toString();
    }


    @Override
    public double calc() {
        return weight * height;
    }

    @Override
    public String getInitialParams() {
        return "Please, enter height and weight for Square.";
    }
}