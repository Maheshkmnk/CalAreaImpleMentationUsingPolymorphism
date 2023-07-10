public class Main {
    public static void main(String[] args) {
        ShapCalculator calculate = new ShapCalculator();

        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(10, 20);

        Triangle triangle = new Triangle(10, 20);

        calculate.printArea(circle);
        calculate.printArea(rectangle);
        calculate.printArea(triangle);

    }
}
