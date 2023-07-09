package strategy;

public class AreaCalculator {
    private Figure figure;

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public double calculateArea() {
        if (figure != null) {
            return figure.calculateArea();
        } else {
            throw new IllegalStateException("Figure is not set.");
        }
    }
}
