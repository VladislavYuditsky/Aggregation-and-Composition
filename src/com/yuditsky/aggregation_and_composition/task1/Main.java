//Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

package com.yuditsky.aggregation_and_composition.task1;

import com.yuditsky.aggregation_and_composition.task1.entity.City;
import com.yuditsky.aggregation_and_composition.task1.entity.Region;
import com.yuditsky.aggregation_and_composition.task1.entity.State;
import com.yuditsky.aggregation_and_composition.task1.logic.CalculateStateSquare;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Region> regions = new ArrayList<>();

        Region region = new Region("Brest", 32787);
        regions.add(region);

        region = new Region("Minsk", 39854);
        regions.add(region);

        State state = new State(region.getRegionCenter(), regions, "Belarus");

        System.out.println("Capital: " + state.getCapital().getName());
        System.out.println("Region number: " + state.getRegions().size());
        System.out.println("Square: " + CalculateStateSquare.calculate(state));
        System.out.println("RegionCenter: ");
        for (Region rgn : state.getRegions()) {
            System.out.println(rgn.getRegionCenter().getName());
        }

    }
}
