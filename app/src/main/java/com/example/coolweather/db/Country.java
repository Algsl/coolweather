package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport{
    private int id;
    private String countryName;
    private String weatherId;
    private int city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }
}
