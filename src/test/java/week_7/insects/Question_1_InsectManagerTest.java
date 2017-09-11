package week_7.insects;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;
import static test_utils.ReflectionUtils.hasFieldOfType;
import static test_utils.ReflectionUtils.hasGetSet;

/**
 * Created by clara on 8/5/17.
 */
public class Question_1_InsectManagerTest {
    
    // Verify Insect class has the correct fields (variables)
    
    @Test
    public void testInsectClassStructure() throws Exception {
        
        Class insectClass = Class.forName("week_7.insects.Insect");
        assertTrue("Insect class should have a name variable", hasFieldOfType(insectClass, "name", String.class));
        assertTrue("Insect class should have a wingCount variable", hasFieldOfType(insectClass, "wingCount", int.class));
        assertTrue("Insect class should have a legCount variable", hasFieldOfType(insectClass, "legCount", int.class));
        
        // Has getters and setters for name, wingCount?
        assertTrue("Add get and set methods for name", hasGetSet(insectClass, "name", String.class));
        assertTrue("Add get and set methods for wingCount", hasGetSet(insectClass, "wingCount", int.class));
        
        Field leg = insectClass.getDeclaredField("LEG_COUNT");
        
        // Is leg static and constant ?
        int modifiers = leg.getModifiers();
        
        assertTrue("legCount should be static", Modifier.isStatic(modifiers));
        assertTrue("legCount should be final (constant)", Modifier.isFinal(modifiers));
    
        // Is it set to 6?
        Object legs = leg.get(null);  // legCount is static so argument is ignored. For an instance field, it will be the objects for which the field value should be read. EG Insect i = new Insect(); Field.get(i);
        assertTrue("legCount should be an int", legs instanceof Integer);
        assertEquals("legCount should be set to 6", 6, (int) legs);
        
        // speciesDataReport method exists, takes no arguments, and is abstract, and returns a String
        
        Method speciesData = insectClass.getDeclaredMethod("speciesDataReport");
        assertTrue("speciesDataReport should be declared abstract", Modifier.isAbstract(speciesData.getModifiers()));
        assertEquals("speciesDataReport should return a String", String.class, speciesData.getReturnType());
        
    }
    
    @Test
    public void testButterflyClassStructure() throws Exception {
        
        Class butterflyClass = Class.forName("week_7.insects.Butterfly");

        //Correct constructor
        try {
            Constructor c = butterflyClass.getDeclaredConstructor(String.class, int.class, String.class, String.class);
            c.newInstance("Monarch", 4, "Orange and Black", "Flowers");
    
        } catch (NoSuchMethodException ne) {
            fail("Butterfly should declare a constructor with 4 arguments in this order: name, wingCount, wingColor, favoriteFlower");
        }
    
        // Don't re-declare any variables from the Insect superclass
        assertFalse("Butterfly class should NOT declare a name variable", hasFieldOfType(butterflyClass, "name", String.class));
        assertFalse("Butterfly class should NOT declare a wingCount variable", hasFieldOfType(butterflyClass, "wingCount", int.class));
        assertFalse("Butterfly class should NOT declare a legCount variable", hasFieldOfType(butterflyClass, "legCount", int.class));
        
        // Check Butterfly is a subclass of Insect
        assertEquals("Butterfly should be a subclass of Insect", Insect.class, butterflyClass.getSuperclass());
        
        // Verify wingColor, favoriteFlower fields present
        assertTrue("Butterfly class should have a wingColor String variable", hasFieldOfType(butterflyClass, "wingColor", String.class));
        assertTrue("Butterfly class should have a favoriteFlower String variable", hasFieldOfType(butterflyClass, "favoriteFlower", String.class));
    
        // And they should be protected or private
        Field wing = butterflyClass.getDeclaredField("wingColor");
        assertTrue("Butterfly's wingColor should be private or protected", Modifier.isPrivate(wing.getModifiers()) || Modifier.isProtected(wing.getModifiers()));
    
        Field flower = butterflyClass.getDeclaredField("favoriteFlower");
        assertTrue("Butterfly's favoriteFlower should be private or protected", Modifier.isPrivate(flower.getModifiers()) || Modifier.isProtected(flower.getModifiers()));
    
    
        // Has getters and setters for wingColor, favoriteFlower?
        assertTrue("Add get and set methods for wingColor", hasGetSet(butterflyClass, "wingColor", String.class));
        assertTrue("Add get and set methods for favoriteFlower", hasGetSet(butterflyClass, "favoriteFlower", String.class));
        
        // speciesDataReport method exists, takes no arguments, and is NOT abstract, and returns a String
        Method speciesData = butterflyClass.getDeclaredMethod("speciesDataReport");
        assertFalse("speciesDataReport should NOT be declared abstract. Implement it for the Butterfly class", Modifier.isAbstract(speciesData.getModifiers()));
        assertEquals("speciesDataReport should return a String", String.class, speciesData.getReturnType());
        
        
        
    }
    
    
    @Test
    public void testBeeClassStructure() throws Exception {
        
        Class beeClass = Class.forName("week_7.insects.Bee");
    
    
        //Correct constructor
        try {
            Constructor c = beeClass.getDeclaredConstructor(String.class, int.class, String.class, boolean.class);
        } catch (NoSuchMethodException ne) {
            fail("Butterfly should declare a constructor with 4 arguments, in this order: name, wingCount, bodyColor, makesHoney");
        }
        
        // Don't re-declare any variables from the Insect superclass
        assertFalse("Bee class should NOT declare a name variable", hasFieldOfType(beeClass, "name", String.class));
        assertFalse("Bee class should NOT declare a wingCount variable", hasFieldOfType(beeClass, "wingCount", int.class));
        assertFalse("Bee class should NOT declare a legCount variable", hasFieldOfType(beeClass, "legCount", int.class));
        
        
        // Check Bee is a subclass of Insect
        
        assertEquals("Bee should be a subclass of Insect", Insect.class, beeClass.getSuperclass());
        
        // Verify bodyColor, makesHoney fields present
        assertTrue("Bee class should have a makesHoney boolean variable", hasFieldOfType(beeClass, "makesHoney", boolean.class));
        assertTrue("Bee class should have a bodyColor String variable", hasFieldOfType(beeClass, "bodyColor", String.class));
        
        // Has getters and setters for bodyColor, makesHoney?
        assertTrue("Add get and set methods for bodyColor", hasGetSet(beeClass, "bodyColor", String.class));
        assertTrue("Add get and set methods for makesHoney", hasGetSet(beeClass, "makesHoney", boolean.class));
    
    
        // And they should be protected or private
        Field wing = beeClass.getDeclaredField("bodyColor");
        assertTrue("Bee's bodyColor should be private or protected", Modifier.isPrivate(wing.getModifiers()) || Modifier.isProtected(wing.getModifiers()));
    
        Field flower = beeClass.getDeclaredField("makesHoney");
        assertTrue("Bee's makesHoney should be private or protected", Modifier.isPrivate(flower.getModifiers()) || Modifier.isProtected(flower.getModifiers()));
    
    
        // speciesDataReport method exists, takes no arguments, and is NOT abstract, and returns a String
        
        Method speciesData = beeClass.getDeclaredMethod("speciesDataReport");
        assertFalse("speciesDataReport should NOT be declared abstract. Implement it for the Bee class", Modifier.isAbstract(speciesData.getModifiers()));
        assertEquals("Bee class speciesDataReport should return a String", String.class, speciesData.getReturnType());
        
    }
    
}
    
