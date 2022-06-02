package creational.abstractFactory.PizzaStores;

import creational.abstractFactory.PizzaFactory;
import creational.abstractFactory.Pizzas.Pizza;

public abstract class PizzaStore {
    PizzaFactory factory;

    // public PizzaStore(PizzaFactory factory){
    //     this.factory = factory;
    // }

    public Pizza orderPizza(String type){
        Pizza pizza;
        // This here is the factory pattern
        // pizza = factory.createPizza(type);
        pizza = createPizza(type);
        // During creation of changing object, we delegate it to some other class
        pizza.prepare();
        pizza.addIngredients();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    // This is a factory method
    abstract Pizza createPizza(String type);
}
