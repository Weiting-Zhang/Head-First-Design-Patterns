/**
 * Beverage
 */
public class Beverage {
    private double milkCost = 1.0;
    private double soyCost = 2.0;
    private double mochaCost = 3.0;
    private double whipCost = 4.0;
    private boolean hasMilk = false;
    private boolean hasMocha = false;
    private boolean hasSoy = false;
    private boolean hasWhip = false;

    public double getMilkCost() {
        return this.milkCost;
    }

    public double getSoyCost() {
        return this.soyCost;
    }

    public double getMochaCost() {
        return this.mochaCost;
    }

    public double getWhipCost() {
        return this.whipCost;
    }

    public void getDescription() {
        System.out.println("A beverage");
    }

    public double cost() {
        double condimentCost = 0.0;
        if(hasMilk()) {
            condimentCost += milkCost;
        }
        if(hasSoy()) {
            condimentCost += soyCost;
        }
        if(hasMocha()) {
            condimentCost += mochaCost;
        }
        if(hasWhip()) {
            condimentCost += whipCost;
        }
        return condimentCost;
    }

    public boolean hasMilk() {
        return this.hasMilk;
    }

    public boolean hasMocha() {
        return this.hasMocha;
    }

    public boolean hasSoy() {
        return this.hasSoy;
    }

    public boolean hasWhip() {
        return this.hasWhip;
    }

    public void setMilk() {
        this.hasMilk = true;
    }

    public void setMocha() {
        this.hasMocha = true;
    }

    public void setSoy() {
        this.hasSoy = true;
    }

    public void setWhip() {
        this.hasWhip = true;
    }
}