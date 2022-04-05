package decoratorPattern;

public class VegglePizzaDecorator extends PizzaDecorator{

    public VegglePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        System.out.println("Adding veggle tapping");
    }
}
