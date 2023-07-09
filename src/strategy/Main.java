package strategy;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Figure rectangle = new Rectangle(5, 10);
        areaCalculator.setFigure(rectangle);
        double rectangleArea = areaCalculator.calculateArea();
        System.out.println("Rectangle area: " +rectangleArea);

        Figure triangle = new Triangle(6, 8);
        areaCalculator.setFigure(triangle);
        double triangleArea = areaCalculator.calculateArea();
        System.out.println("Triangle area: " + triangleArea);
    }
}
