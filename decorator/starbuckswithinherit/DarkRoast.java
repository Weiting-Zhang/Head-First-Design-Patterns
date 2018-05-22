/**
 * DarkRoast
 */
public class DarkRoast extends Beverage {
    public void getDescription() {
        System.out.println("An Excellent Dark Roast");
    }
    public double cost() {
        return 1.99 + super.cost();
    }
}