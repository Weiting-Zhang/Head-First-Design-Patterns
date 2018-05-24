/**
 * Soy
 */
public class Soy extends Condimentdecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.Tall) {
            cost += .10;
        } else if (beverage.getSize() == Size.GEANDE) {
            cost += .15;
        } else if(beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}