import java.util.Observable;
import java.util.Observer;

/**
 * currentConditionsDisplay
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable; // 用于在构造函数中为可观察对象注册观察者
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) { // 构造器需要一个 Observable 当参数
        this.observable = observable;
        observable.addObserver(this); // 并将 CurrentConditionDisplay 的实例注册为观察者
    }

    public void update(Observable obs, Object arg) { // 实现 Observer 接口的 update() 方法，这里 obs 应该是一个 WeatherData 实例， arg 是数据对象（调用时并没有传入，所以这里也没有用）
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}