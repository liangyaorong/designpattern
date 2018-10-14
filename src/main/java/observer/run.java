package observer;

public class run {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondictionDisplayer currentCondictionDisplayer = new CurrentCondictionDisplayer(weatherData);

        weatherData.setMeasurements(35f, 0.6f, 10f);
        currentCondictionDisplayer.display();
    }
}
