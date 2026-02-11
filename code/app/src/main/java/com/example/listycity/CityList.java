package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kotlin.collections.ArrayDeque;

/**
 * this is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * adds a city to the list if the city not already exist there
     * @param city
     *      this is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
