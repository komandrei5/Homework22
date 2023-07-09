package builder;

public interface CarBuilder {
    void buildModel(String model);
    void buildColor(String color);
    void buildEngineType(String engineType);
    void buildInteriorDecoration(String interiorDecoration);
    void buildSecurityPackage(String securityPackage);
    Car getResult();
}
