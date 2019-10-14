//Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

package com.yuditsky.aggregation_and_composition.task1;

import com.yuditsky.aggregation_and_composition.task1.entity.Capital;
import com.yuditsky.aggregation_and_composition.task1.entity.Region;
import com.yuditsky.aggregation_and_composition.task1.entity.State;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        State state = new State(new Capital(), new ArrayList<Region> (), "Belarus");

        System.out.println("Capital: " + state.getCapital().getName());
        System.out.println("Region number: " + state.getRegions().size());
        System.out.println("Square " );
        int square = 0;
        for(Region region : state.getRegions()){
            square += region.getSquare();
        }
        System.out.println(square);
        System.out.println("RegionCenter: ");
        for(Region region : state.getRegions()){
            System.out.println(region.getRegionCenter().getName());
        }

    }
}
