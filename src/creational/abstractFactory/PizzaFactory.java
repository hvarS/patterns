package creational.abstractFactory;

import creational.abstractFactory.Pizzas.CheesePizza;
import creational.abstractFactory.Pizzas.PepperoniPizza;
import creational.abstractFactory.Pizzas.Pizza;

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
