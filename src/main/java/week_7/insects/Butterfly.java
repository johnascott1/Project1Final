package week_7.insects;

/**
 * Represents a butterfly species
 */

public class Butterfly extends Insect {
    
    // TODO make this a subclass of Insect
    
    // TODO add a String called wingColor. Add get and set methods
    String wingColor;

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getWingColor() {
        return wingColor;
    }

    // TODO add a String called favoriteFlower. Add get and set methods
    String favoriteFlower;

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    // TODO add a constructor to set all necessary values

    public Butterfly(String wingColor, String favoriteFlower) {
        this.wingColor = wingColor;
        this.favoriteFlower = favoriteFlower;
    }

    // TODO override the speciesDataReport method to return a String with Butterfly information

    @Override
    public String speciesDataReport() {
        return "Species = Butterfly, Wing Color = " + wingColor + ", Favorite flower = " + favoriteFlower + ".";
    }
}
