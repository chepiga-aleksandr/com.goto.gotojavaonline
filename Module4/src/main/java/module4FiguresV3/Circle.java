package module4FiguresV3;

class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getFigureType() {
        return this.getClass().getSimpleName().toString();
    }

    @Override
    public String getInitialParams() {
        return "Please, enter radius for Square:";
    }

    @Override
    public double calc() {
        return Math.PI * radius * radius;
    }
}
