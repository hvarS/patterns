package creational.factory;

import creational.factory.Pizzas.CheesePizza;
import creational.factory.Pizzas.PepperoniPizza;
import creational.factory.Pizzas.Pizza;

public class PizzaFactory {
    public PizzaFactory() {
        return ;
    }
    public Pizza createPizza(String type) {
        
        Pizza pizza;

        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else{
            pizza = new CheesePizza();
        }

        return pizza;
    }
}
