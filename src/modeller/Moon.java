package modeller;

public class Moon extends OrbitalObject{

    private String planet;

    public Moon(String planet, String name, double massInMegaton, String galaxy, int averageTempInCelcius, double number) {
        super(name, massInMegaton, galaxy, averageTempInCelcius, number);
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }
}
