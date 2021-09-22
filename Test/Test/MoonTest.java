package Test;

import modeller.Moon;
import junit.framework.TestCase;
import org.junit.Test;

public class MoonTest extends TestCase {

    @Test
    public void testGetPlanet() {

        //Arrange
        Moon luna = new Moon("Earth", "Luna", 0.0, "Milkyway", 106, 1);

        //Act

        String whichPlanet = luna.getPlanet();

        //Assert

        assertEquals("Earth", whichPlanet);

    }

}