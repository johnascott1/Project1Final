package week_7.insects;

/**
 * Represents a Bee species.
 */

public class Bee extends Insect {
    
    // TODO make this a subclass of Insect
    
    // TODO add a boolean called makesHoney
    boolean makesHoney;

    public void setMakesHoney(boolean makesHoney) {
        this.makesHoney = makesHoney;
    }

    public boolean isMakesHoney() {
        return makesHoney;
    }

    // TODO add a String called bodyColor

    String bodyColor;

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    // TODO add a constructor to set all necessary values

    public Bee(String name, int wingCount,String bodyColor, boolean makesHoney) {
        this.name = name;
        this.wingCount = wingCount;
        this.bodyColor = bodyColor;
        this.makesHoney = makesHoney;
    }


    // TODO override the speciesDataReport to return a String with Bee information


    @Override
    public String speciesDataReport() {
        return "The Bee makes honey: "+makesHoney+", Body Color: "+bodyColor+".";
    }
}
