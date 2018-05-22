/**
 * CurrentConditionsDisplay
 * 此布告板实现了 Observer 接口，所以可以从 WeatherData 中获取
 * 它也实现了 DisplayElement 接口，所以它可以展示天气相关的信息
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity; // temperature 和 humidity 用于展示
    private Subject weatherData; // weatherData 用于注册/取消注册本观察者

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}