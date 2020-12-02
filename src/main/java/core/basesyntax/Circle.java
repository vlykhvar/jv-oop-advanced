package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private double radius;

    Circle(double radius, Color color) {
        this.radius = radius;
        setColor(color);
        setArea((Math.pow(radius,2) * PI));
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String draw() {
        return "Shape: circle, area: " + getArea() + " sq. units"
                + " radius: " + getRadius() + " units, "
                + "color: " + getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    public double getRadius() {
        return radius;
    }
}
