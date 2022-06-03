package structural.decorator;

public class Mocha extends Decorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+19.99;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Mocha";
    }
}
