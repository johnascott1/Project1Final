package week_7.service_calls;

import java.util.TreeMap;

import static input.InputUtils.positiveIntInput;

/**
 * Created by clara on 8/9/17.
 */
public class HVAC_Input {
    
    /* Request a valid type from the furnace types allowed, based on the FurnaceTypes enum */
    public static Furnace.FurnaceType getFurnaceType() {
        
        //Build a TreeMap - a HashMap with sorted keys - of the valid types
        TreeMap<Integer, Furnace.FurnaceType> furnaceTypes = new TreeMap<Integer, Furnace.FurnaceType>();
        
        int code = 1;
        for (Furnace.FurnaceType type : Furnace.FurnaceType.values()) {
            furnaceTypes.put(code++, type);
        }
        
        int totalTypes = code - 1;   //If there are 3 types, then code will be 4 at the end of the loop.
        
        // Display codes and types, ask user to enter code number corresponding to the desired type
        // Validate that the type code entered is a valid one.
        while (true) {
            
            System.out.println("Enter type of furnace");
            
            for (int typeCode : furnaceTypes.keySet()) {
                System.out.println(typeCode + " " + furnaceTypes.get(typeCode));
            }
            
            int typeCodeInt = positiveIntInput();
            
            if ( typeCodeInt > totalTypes || typeCodeInt < 1 ) {
                System.out.println("Please enter a valid type code number");
            }
            
            else {
                return furnaceTypes.get(typeCodeInt);
            }
        }
    }
    
}
