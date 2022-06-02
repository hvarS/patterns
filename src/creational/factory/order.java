package creational.factory;

import creational.factory.PizzaStores.NYPizzaStore;
import creational.factory.PizzaStores.PizzaStore;


public class order {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
    } 
}
