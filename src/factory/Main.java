package factory;

public class Main {
    public static void main(String[] args) {
        Furniture chair = FurnitureFactory.createFurniture("chair");
        chair.assemble();
        chair.packaging();
        Furniture table = FurnitureFactory.createFurniture("table");
        table.assemble();
        table.packaging();
        Furniture sofa = FurnitureFactory.createFurniture("sofa");
        sofa.assemble();
        sofa.packaging();
    }
}
