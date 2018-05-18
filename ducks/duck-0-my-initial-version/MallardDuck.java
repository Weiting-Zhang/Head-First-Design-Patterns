public class MallardDuck extends Duck {
    public MallardDuck () {
        // 因为 MallardDuck 继承了 Duck 类，所以具有 flyBehavior 等实例变量
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display () {
        System.out.println("I'm a real Mallard duck.");
    }
}