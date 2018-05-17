public class Duck {
    // 行为变量被声明为行为接口类型
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        // 鸭子对象不具体处理呱呱叫行为，而是委托给 quackBehavior 引用的对象
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("I'm swimming.");
    }

    public void display() {
        System.out.println("I'm a duck.");
    }
}
