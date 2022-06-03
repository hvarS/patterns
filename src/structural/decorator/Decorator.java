package structural.decorator;

// This is the abstract decorator 

public abstract class Decorator extends Beverage{
    Beverage beverage;
    
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
