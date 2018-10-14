package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondictionDisplayer implements Observer {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentCondictionDisplayer(Observable observable) {
        this.observable  = observable;

        //外面传进来的observable添加observer
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
    }

    public void display() {
        System.out.println(String.format(
                "current condition: temperature:%s degrees and humidity:%s",
                this.temperature, this.humidity));
    }
 }
