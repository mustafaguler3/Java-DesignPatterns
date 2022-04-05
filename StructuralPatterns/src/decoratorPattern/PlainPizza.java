package decoratorPattern;

public class PlainPizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("Baking Plain Pizza");
    }
}
