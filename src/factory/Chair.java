package factory;

public class Chair implements Furniture{
    @Override
    public void assemble() {
        System.out.println("Assembling a chair");
    }

    @Override
    public void packaging() {
        System.out.println("Packaging a chair");
        System.out.println();
    }
}
