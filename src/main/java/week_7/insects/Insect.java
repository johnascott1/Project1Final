package week_7.insects;

/**
 * Represents a general insect species
 */

public abstract class Insect {
    
    
    // TODO add a String called name
    protected String name;
    // TODO add an int called wingCount
    protected int wingCount;
    // TODO add a static constant int called LEG_COUNT, set it to 6
    public static int LEG_COUNT = 6;
    // TODO add an abstract method called speciesDataReport that subclasses will be forced to overrides
    // speciesDataReport should take no arguments, and return a String.
    // You don't need to write the method body. Insect's subclasses will do that.
    abstract String speciesDataReport();




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public int getWingCount() {
        return wingCount;
    }

    public static void setLegCount(int legCount) {
        LEG_COUNT = legCount;
    }

    public static int getLegCount() {
        return LEG_COUNT;
    }
}
