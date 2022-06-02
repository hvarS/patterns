package creational.abstractFactory;

import creational.abstractFactory.Pizzas.Pizza;

public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        // This here is the factory pattern
        pizza = factory.createPizza(type);
        // During creation of changing object, we delegate it to some other class
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
