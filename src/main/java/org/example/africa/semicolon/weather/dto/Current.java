package org.example.africa.semicolon.weather.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Current {
    @JsonProperty("observation_time")
    private String observationTime;

    private Integer temperature;

    @JsonProperty("weather_code")
    private Integer weatherCode;

    @JsonProperty("weather_icons")
    private List<String> weatherIcons;

    @JsonProperty("weather_descriptions")
    private List<String> weatherDescriptions;

    private Astro astro;

    @JsonProperty("air_quality")
    private AirQuality airQuality;

    @JsonProperty("wind_speed")
    private Integer windSpeed;

    @JsonProperty("wind_degree")
    private Integer windDegree;

    @JsonProperty("wind_dir")
    private String windDir;

    private Integer pressure;

    private Double precip;

    private Integer humidity;

    private Integer cloudcover;

    private Integer feelslike;

    @JsonProperty("uv_index")
    private Integer uvIndex;

    private Integer visibility;

    @JsonProperty("is_day")
    private String isDay;

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public AirQuality getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(AirQuality airQuality) {
        this.airQuality = airQuality;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Integer getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Integer feelslike) {
        this.feelslike = feelslike;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    @Override
    public String toString() {
        return "Current{" +
                "observationTime='" + observationTime + '\'' +
                ", temperature=" + temperature +
                ", weatherCode=" + weatherCode +
                ", weatherIcons=" + weatherIcons +
                ", weatherDescriptions=" + weatherDescriptions +
                ", astro=" + astro +
                ", airQuality=" + airQuality +
                ", windSpeed=" + windSpeed +
                ", windDegree=" + windDegree +
                ", windDir='" + windDir + '\'' +
                ", pressure=" + pressure +
                ", precip=" + precip +
                ", humidity=" + humidity +
                ", cloudcover=" + cloudcover +
                ", feelslike=" + feelslike +
                ", uvIndex=" + uvIndex +
                ", visibility=" + visibility +
                ", isDay='" + isDay + '\'' +
                '}';
    }
}