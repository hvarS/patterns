package creational.abstractFactory.PizzaStores;

import creational.abstractFactory.Pizzas.NYStyleCheesePizza;
import creational.abstractFactory.Pizzas.NYStyleClamPizza;
import creational.abstractFactory.Pizzas.NYStylePepperoniPizza;
import creational.abstractFactory.Pizzas.NYStyleVeggiePizza;
import creational.abstractFactory.Pizzas.Pizza;

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
