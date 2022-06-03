package structural.decorator;

// This is a concrete component
public class Espresso extends Beverage{
    
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 199.99;
    }

}
