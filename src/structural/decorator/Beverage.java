package structural.decorator;

/**
 * Beverage
 */
public abstract class Beverage {
    
    public enum Size{
        TALL,
        GRANDE,
        VERTI
    }

    Size size = null;

    String description = "Beverage Superclass";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize()   {
        return this.size;
    }

    public abstract double cost();
}