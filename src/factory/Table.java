package factory;

public class Table implements Furniture{
    @Override
    public void assemble() {
        System.out.println("Assembling a table");
    }

    @Override
    public void packaging() {
        System.out.println("Packaging a table");
        System.out.println();
    }
}
