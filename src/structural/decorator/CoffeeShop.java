package structural.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription()+", Cost - "+beverage.cost());

        
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()+", Cost - "+beverage.cost());
    } 
}
