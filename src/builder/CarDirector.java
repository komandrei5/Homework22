package builder;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public void constructCar() {
        carBuilder.buildModel("Model XYZ");
        carBuilder.buildColor("Red");
        carBuilder.buildEngineType("9L");
        carBuilder.buildInteriorDecoration("Leather");
        carBuilder.buildSecurityPackage("Advanced");
    }

    public Car getCar() {
        return carBuilder.getResult();
    }
}
