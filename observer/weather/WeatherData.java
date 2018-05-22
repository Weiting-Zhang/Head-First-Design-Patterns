import java.util.ArrayList;

/**
 * WeatherData
 */
public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure); // 观察者实现了 update() ，使用 update() 通知
        }
    }

    public void meassurementsChanged() {
        notifyObservers(); // 获得新的观测值时，通知观察者
    }

    public void setMeasurements(float temperature, float humidity, float pressure) { // 利用这个方法测试布告板
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        meassurementsChanged();
    }
}