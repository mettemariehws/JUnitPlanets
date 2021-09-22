package modeller;

public abstract class OrbitalObject {

    private String name;
    private double massInMegaton;
    private String galaxy;
    private int averageTempInCelcius;
    private double number;

    public OrbitalObject(String name, double order, String galaxy, int averageTempInCelcius, double number){
        this.name = name;
        this.massInMegaton = order;
        this.galaxy = galaxy;
        this.averageTempInCelcius = averageTempInCelcius;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMassInMegaton() {
        return massInMegaton;
    }

    public void setMassInMegaton(double massInMegaton) {
        this.massInMegaton = massInMegaton;
    }

    public String getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(String galaxy) {
        this.galaxy = galaxy;
    }

    public int getAverageTempInCelcius() {
        return averageTempInCelcius;
    }

    public void setAverageTempInCelcius(int averageTempInCelcius) {
        this.averageTempInCelcius = averageTempInCelcius;
    }


    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return "Name = " + name + "Mass = " + massInMegaton + " Which galaxy = "
                + galaxy + "Average temperatur = " + averageTempInCelcius + "NumberFromTheSun = " + number;
    }

}
