package week_7.insects;

/**
 * Represents a general insect species
 */

public abstract class Insect {
    
    
    // TODO add a String called name
    
    // TODO add an int called wingCount
    
    // TODO add a static constant int called legCount, set it to 6
    
    // TODO add an abstract method called speciesDataReport that subclasses will be forced to override
    // speciesDataReport should take no arguments, and return a String.
    
    // TODO make the Insect class abstract
    
    String name;
    int wingCount;
    static final int legCount = 6;
    abstract String speciesDataReport();
    
}
