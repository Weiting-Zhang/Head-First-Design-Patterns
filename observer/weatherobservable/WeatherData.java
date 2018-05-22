import java.util.Observable;
import java.util.Observer;

/**
 * WeatherData
 */
public class WeatherData extends Observable { // 继承 Observable
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        setChanged(); // 指示状态已改变。可以让通知变的更有弹性？
        notifyObservers(); // 没有利用 notifyObserver() 传送数据，采用的做法是“拉”
        // 如果要“推”的话，就是这样调用：notifyObservers(dataObj)
        // notifyObservers() 内部会帮我们调用注册了的观察者中的 update(observable, dataObj)
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() { // 因为要使用“拉”的方法，所以观察者们调用他们来获得 WeatherData 对象的状态
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}