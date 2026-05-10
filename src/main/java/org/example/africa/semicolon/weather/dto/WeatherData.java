package org.example.africa.semicolon.weather.dto;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.net.httpserver.Request;

public class WeatherData {
    private Request request;

    private Location location;

    private Current current;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "request=" + request +
                ", location=" + location +
                ", current=" + current +
                '}';
    }
}