package factory;

public class FurnitureFactory {
    public static Furniture createFurniture(String type) {
        if(type.equalsIgnoreCase("chair")) {
            return new Chair();
        } else if (type.equalsIgnoreCase("table")) {
            return new Table();
        } else if (type.equalsIgnoreCase("sofa")) {
            return new Sofa();
        } else {
            throw new IllegalArgumentException("Invalid furniture type: " + type);
        }
    }
}
