package com.yuditsky.aggregation_and_composition.task1.logic;

import com.yuditsky.aggregation_and_composition.task1.entity.City;
import com.yuditsky.aggregation_and_composition.task1.entity.District;
import com.yuditsky.aggregation_and_composition.task1.entity.Region;

public class CalculateRegionSquare {
    public static double calculate(Region region) {
        int square = 0;

        for (District district : region.getDistricts()) {
            for (City city : district.getCities()) {
                square += city.getSquare();
            }
            square += district.getSquare();
        }

        return square;
    }
}
