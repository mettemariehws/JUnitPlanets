package Test;

import modeller.Moon;
import modeller.Planet;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;
import service.PlanetService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlanetServiceTest {

    @Test
    public void countHowManyMoons() {

        //  Arrange
        Moon luna = new Moon("Earth", "Luna", 0, "Milkyway", 106,1 );
        Moon luna2 = new Moon("Earth", "Luna2", 0, "Milkyway", 106,1 );
        Moon luna3 = new Moon("Earth", "Luna3", 0, "Milkyway", 106,1 );
        Moon[] moonForEarth = {luna, luna2, luna3};

        Planet earth = new Planet("Earth", 1.0, "Milkyway", 18, 3, moonForEarth);

        PlanetService planetService = new PlanetService();

        // Act

        int earthGettingMoons = planetService.countHowManyMoons(earth);

        // Assert

        assertEquals(3, earthGettingMoons);
    }

    @ParameterizedTest
    @ValueSource(ints = 3)
    public void checkNumberFromSun(@ConvertWith(PlanetConverter.class)Planet planet) {

        assertEquals(3, planet.getNumber());
    }
}