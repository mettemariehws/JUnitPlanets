package modeller;

public class Planet extends OrbitalObject {

    private double distanceToSun;
    private Moon[] moons;

    public Planet(String name, double massInMegaton, String galaxy, int averageTempInCelcius, int number, Moon[] moons) {
        super(name, massInMegaton, galaxy, averageTempInCelcius, number);
        this.moons = moons;
    }

    public Planet(String name, double massInMegaton, String galaxy, int averageTempInCelcius,int number, double distanceToSun) {
        super(name, massInMegaton, galaxy, averageTempInCelcius, number);
        this.distanceToSun = distanceToSun;

    }

    public Planet(String name, double massInMegaton, String galaxy, int averageTempInCelcius,int number, Moon[] moons, double distanceToSun) {
        super(name, massInMegaton, galaxy, averageTempInCelcius, number);
        this.moons = moons;
        this.distanceToSun = distanceToSun;

    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public Moon[] getMoons() {
        return moons;
    }

    public void setMoons(Moon[] moons) {
        this.moons = moons;
    }

}
