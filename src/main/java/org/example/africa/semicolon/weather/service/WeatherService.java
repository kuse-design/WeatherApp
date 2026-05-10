package org.example.africa.semicolon.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.dotenv.Dotenv;
import org.example.africa.semicolon.weather.dto.WeatherData;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Paths;
import java.util.Scanner;

public class WeatherService {
    public WeatherData getweatherFor(String city){
        Dotenv dotenv = Dotenv.load();
        final String url = "http://api.weatherstack.com/current";
        final String apiKey = dotenv.get("WEATHER_API_KEY");

        String uri = url.concat( "?access_key=")
                        .concat( apiKey)
                        .concat( "&query=")
                        .concat(city);

        URI apiUri = URI.create(uri);
        try(InputStream inputStream = apiUri.toURL().openStream();) {
              byte[] data = inputStream.readAllBytes();
              ObjectMapper objectMapper = new ObjectMapper();
               WeatherData weatherData = objectMapper.readValue(inputStream,  WeatherData.class);
               return weatherData;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}



