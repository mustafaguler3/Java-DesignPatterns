package factory;

public class ChickenPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza");
    }
}
