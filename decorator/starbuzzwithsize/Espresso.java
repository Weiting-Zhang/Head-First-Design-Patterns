/**
 * Espresso
 */
public class Espresso extends Beverage {
    public Espresso () {
        description = "Espresso"; // 在构造器中改变实例变量 description
    }

    public double cost() {
        return 1.99; // 直接返回 Espresso 的价钱
    }
}