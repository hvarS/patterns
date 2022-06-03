package structural.decorator;


// This is a concrete component
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 149.99;
    }
    
}
