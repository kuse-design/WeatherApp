package org.example.africa.semicolon.weather.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("region")
    private String region;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("timezone_id")
    private String timezoneId;
    @JsonProperty("localtime")
    private String localtime;
    @JsonProperty("localtime_epoch")
    private Integer localtime_epoch;
    @JsonProperty("utc_offset")
    private String utc_offset;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
    public String getLat() { return lat; }
    public void setLat(String lat) { this.lat = lat; }
    public String getLon() { return lon; }
    public void setLon(String lon) { this.lon = lon; }
    public String getTimezone_id() { return timezoneId; }
    public void setTimezone_id(String timezone_id) { this.timezoneId = timezone_id; }
    public String getLocaltime() { return localtime; }
    public void setLocaltime(String localtime) { this.localtime = localtime; }
    public Integer getLocaltime_epoch() { return localtime_epoch; }
    public void setLocaltime_epoch(Integer localtime_epoch) { this.localtime_epoch = localtime_epoch; }
    public String getUtc_offset() { return utc_offset; }
    public void setUtc_offset(String utc_offset) { this.utc_offset = utc_offset; }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", timezone_id='" + timezoneId + '\'' +
                ", localtime='" + localtime + '\'' +
                ", localtime_epoch=" + localtime_epoch +
                ", utc_offset='" + utc_offset + '\'' +
                '}';
    }
}