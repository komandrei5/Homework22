package builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new ConcreteCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);

        carDirector.constructCar();
        Car car = carDirector.getCar();

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getEngineType());
        System.out.println(car.getInteriorDecoration());
        System.out.println(car.getSecurityPackage());
    }
}
