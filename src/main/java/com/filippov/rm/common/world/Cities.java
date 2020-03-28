package com.filippov.rm.common.world;

import java.util.List;

public class Cities {

    private List<City> citiesList;

    private City specialCity;

    private List<City> bigCities;

    public List<City> getCitiesList() {
        return citiesList;
    }

    public void setCitiesList(List<City> citiesList) {
        this.citiesList = citiesList;
    }

    public City getSpecialCity() {
        System.out.println(specialCity);
        return specialCity;
    }

    public void setSpecialCity(City specialCity) {
        this.specialCity = specialCity;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "citiesList=" + citiesList +
                '}';
    }

    public List<City> getBigCities() {
        System.out.println(bigCities);
        return bigCities;
    }

    public void setBigCities(List<City> bigCities) {
        this.bigCities = bigCities;
    }
}
