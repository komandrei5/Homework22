package builder;

public class ConcreteCarBuilder implements CarBuilder {
    private String model;
    private String color;
    private String engineType;
    private String interiorDecoration;
    private String securityPackage;

    @Override
    public void buildModel(String model) {
        this.model = model;
    }

    @Override
    public void buildColor(String color) {
        this.color = color;
    }

    @Override
    public void buildEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void buildInteriorDecoration(String interiorDecoration) {
        this.interiorDecoration = interiorDecoration;
    }

    @Override
    public void buildSecurityPackage(String securityPackage) {
        this.securityPackage = securityPackage;
    }

    @Override
    public Car getResult() {
        return new Car(model, color, engineType, interiorDecoration, securityPackage);
    }
}
