/**
 * Condimentdecorator
 */
public abstract class Condimentdecorator extends Beverage {
    public abstract String getDescription(); // 所有的调料必须实现 getDescription 方法 why? 因为想在最终的 description 中加入调味剂的信息

}