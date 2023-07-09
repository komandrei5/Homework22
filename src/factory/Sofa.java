package factory;

public class Sofa implements Furniture{
    @Override
    public void assemble() {
        System.out.println("Assembling a sofa");
    }

    @Override
    public void packaging() {
        System.out.println("Packaging a sofa");
        System.out.println();
    }
}
