package creational.abstractFactory;

import creational.abstractFactory.PizzaStores.NYPizzaStore;
import creational.abstractFactory.PizzaStores.PizzaStore;


public class order {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
    } 
}
