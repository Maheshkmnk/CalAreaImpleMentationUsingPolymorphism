public class Triangle extends Shape {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 2;
    }
}
