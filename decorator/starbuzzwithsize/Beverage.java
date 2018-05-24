package headfirst.designpatterns.decorator.starbuzzWithSizes;

/**
 * Beverage
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public enum Size { Tall, GEANDE, VENTI };
    Size size = size.GEANDE;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size newSize) {
        this.size = newSize;
    }
}