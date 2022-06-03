package structural.decorator;

public class Mocha extends Decorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double bevCost = this.beverage.cost();
        if(this.beverage.getSize() == Size.TALL) {
            return bevCost+19.99;
        } else if(this.beverage.getSize() == Size.GRANDE) {
            return bevCost+29.99;
        } else {
            return bevCost+39.99;
        }
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Mocha";
    }
}
