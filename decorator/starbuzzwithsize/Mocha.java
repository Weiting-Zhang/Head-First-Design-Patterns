/**
 * Mocha
 */
public class Mocha extends Condimentdecorator {
    Beverage beverage; // 要让 Mocha 能够引用到一个 Beverage 做法：用一个实例变量记录饮料（被装饰者）
    public Mocha(Beverage beverage) {
        this.beverage = beverage; // 想办法让被装饰者（饮料）被记录到实例变量中 这里的做法是，把饮料当做构造器的参数，再由构造器将此饮料记录到实例变量中
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha"; // 利用委托的做法，得到一个叙述，再加上附加的叙述
    }

    public double cost() {
        return .20 + beverage.cost(); // 首先把调用委托给被装饰对象，以计算价钱，再加上 Mocha 的价钱
    }
}