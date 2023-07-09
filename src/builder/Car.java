package builder;

public class Car {
    private String model;
    private String color;
    private String engineType;
    private String interiorDecoration;
    private String securityPackage;

    public Car(String model, String color, String engineType, String interiorDecoration, String securityPackage) {
        this.model = model;
        this.color = color;
        this.engineType = engineType;
        this.interiorDecoration = interiorDecoration;
        this.securityPackage = securityPackage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getInteriorDecoration() {
        return interiorDecoration;
    }

    public void setInteriorDecoration(String interiorDecoration) {
        this.interiorDecoration = interiorDecoration;
    }

    public String getSecurityPackage() {
        return securityPackage;
    }

    public void setSecurityPackage(String securityPackage) {
        this.securityPackage = securityPackage;
    }
}
