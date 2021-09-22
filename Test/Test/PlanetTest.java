package Test;

import modeller.Moon;
import modeller.Planet;
import junit.framework.TestCase;
import org.junit.Test;

public class PlanetTest extends TestCase {

    @Test
    public void testGetMass() {

        //Arrange
        Moon luna = new Moon("Earth", "Luna", 0, "Milkyway", 106, 1);
        Moon[] moonForEarth = {luna};

        Planet earth = new Planet("Earth", 1.0, "Milkyway", 18,3, moonForEarth);
        //Act

        double earth1 = earth.getMassInMegaton();

        //Assert

        assertEquals(1.0, earth1);

    }

    @Test
    public void testGetAverageTempInCelcius() {
        //Arrange
        Moon luna = new Moon("Earth", "Luna", 0, "Milkyway", 106, 1);
        Moon[] moonForEarth = {luna};

        Planet earth = new Planet("Earth", 1, "Milkyway", 18, 3, moonForEarth);
        //Act

        int earth1 = earth.getAverageTempInCelcius();

        //Assert

        assertEquals(18, earth1);

    }

    public void testGetGalaxy() {
        //Arrange
        Moon luna = new Moon("Earth", "Luna", 0, "Milkyway", 106,1 );
        Moon[] moonForEarth = {luna};

        Planet earth = new Planet("Earth", 1, "Milkyway", 18,3, moonForEarth);
        //Act

        String earth1 = earth.getGalaxy();

        //Assert

        assertEquals("Milkyway", earth1);
    }

    public void testGetName() {
        //Arrange
        Moon luna = new Moon("Earth", "Luna", 0, "Milkyway", 106,1);
        Moon[] moonForEarth = {luna};

        Planet earth = new Planet("Earth", 1, "Milkyway", 18, 3, moonForEarth);
        //Act

        String earth1 = earth.getName();

        //Assert

        assertEquals("Earth", earth1);
    }

    public void testGetMoon() {
        //Arrange
        Moon luna = new Moon("Earth", "Luna", 0, "Milkyway", 106,1);
        Moon[] moonForEarth = {luna};

        Planet earth = new Planet("Earth", 1, "Milkyway", 18, 3,  moonForEarth);
        //Act

        Moon[] earth1 = earth.getMoons();

        //Assert
        assertEquals(1, earth1.length);
    }

}