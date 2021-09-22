package service;

import modeller.Moon;
import modeller.Planet;

import java.util.Arrays;

public class PlanetService {

    public int countHowManyMoons(Planet planet){

        Moon[] moonsArray = planet.getMoons();

        int counter = 0;

        for (int i = 0; i < moonsArray.length ; i++) {
            counter++;

        }
        //the easy way: int numberOfMoons = moonsArray.length;
        return counter;
    }

    public void differenceDistanceInPlanets(Planet planet1, Planet planet2){

        double planet1DistanceFromSun = planet1.getDistanceToSun();
        double planet2DistanceFromSun = planet2.getDistanceToSun();


    }

}
