package factory;

public class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza p = null;

        if(type.equalsIgnoreCase("cheese")){
            p = new CheesePizza();
        }else if (type.equals("chicken")){
            p = new ChickenPizza();
        }else if (type.equals("veggle")){
            p = new VegglePizza();
        }

        return p;
    }
}
