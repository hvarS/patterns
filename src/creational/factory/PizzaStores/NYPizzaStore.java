package creational.factory.PizzaStores;

import creational.factory.Pizzas.NYStyleCheesePizza;
import creational.factory.Pizzas.NYStyleClamPizza;
import creational.factory.Pizzas.NYStylePepperoniPizza;
import creational.factory.Pizzas.NYStyleVeggiePizza;
import creational.factory.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type)  {
        System.out.println("-- Creating NY styled Pizzas ! Enjoy !");
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
