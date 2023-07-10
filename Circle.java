public class Circle extends Shape {

    private static final double pie = 3.14;
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double calculateArea() {
        return pie * radious * radious;
    }
}
