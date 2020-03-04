package com.weatherReport.Controller;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import java.io.Serializable;


@JsonIgnoreProperties(value = {"coord","weather","base","visibility","wind","clouds","dt","sys","timezone","id","cod"})
@JsonPropertyOrder(value = {"main" , "name"})
public class weather implements Serializable {
    private Main main;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}


class Main{
    double temp;
    String feels_like;
    String temp_min;
    String temp_max;
    String pressure;
    String humidity;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp-273.15;
    }

    public String getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(String feels_like) {
        this.feels_like = feels_like;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
