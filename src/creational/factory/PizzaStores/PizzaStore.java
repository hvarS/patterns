package creational.factory.PizzaStores;

import creational.factory.PizzaFactory;
import creational.factory.Pizzas.Pizza;

public abstract class PizzaStore {
    PizzaFactory factory;

    // public PizzaStore(PizzaFactory factory){
    //     this.factory = factory;
    // }

    public Pizza orderPizza(String type){
        Pizza pizza;
        
        // This here is the simple factory pattern
        // It encapsulated object creation

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
    // The Factory Method Pattern encapsulates object
    // creation by letting subclasses decide what objects to create.
    abstract Pizza createPizza(String type);
}
