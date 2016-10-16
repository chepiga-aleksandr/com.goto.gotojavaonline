package module4FiguresV3;

class Triangle extends Figure {
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
        return this.getClass().getSimpleName().toString();
    }

    @Override
    public String getInitialParams() {
        return "Please, enter height and weight for Triangle:";
    }

    @Override
    public double calc() {
        return 0.5 * weight * height;
    }
}
