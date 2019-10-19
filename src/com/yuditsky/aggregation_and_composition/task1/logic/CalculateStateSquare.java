package com.yuditsky.aggregation_and_composition.task1.logic;

import com.yuditsky.aggregation_and_composition.task1.entity.Region;
import com.yuditsky.aggregation_and_composition.task1.entity.State;

public class CalculateStateSquare {
    public static double calculate(State state) {
        double square = 0;

        for (Region region : state.getRegions()) {
            CalculateRegionSquare.calculate(region);
            square += region.getSquare();
        }

        return square;
    }
}
