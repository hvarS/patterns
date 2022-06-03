package structural.decorator;

/**
 * Beverage
 */
public abstract class Beverage {
    String description = "Beverage Superclass";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}