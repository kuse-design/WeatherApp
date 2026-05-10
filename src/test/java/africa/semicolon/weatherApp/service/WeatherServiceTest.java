package africa.semicolon.weatherApp.service;

import org.example.africa.semicolon.weather.dto.WeatherData;
import org.example.africa.semicolon.weather.service.WeatherService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.testng.AssertJUnit.assertNotNull;

class WeatherServiceTest {

    @Test
    void getWeatherFor() {
        WeatherService weatherService = new WeatherService();
        WeatherData weatherData = weatherService.getweatherFor("Lagos");
        assertNotNull(weatherData);
        assertNotNull(weatherData.getLocation());
    }
}