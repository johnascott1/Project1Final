package week_7.service_calls;

import org.junit.Test;

/**
 * Created by clara on 8/4/17.
 */

public class Question_2_HVACTest {
    
    
    
    /*a. In your HVAC program, create a new class called WaterHeater. This represents a service call for a water heater. A water heater service call needs an address, date service requested, description of the problem, and the age of the water heater. Resolved service calls also need the resolved date, description of the resolution, and the fee charged to the customer.

b. The city requires that all service calls to water heaters have a mandatory $20 extra charge added. As this applies to all water heaters, add a static variable to your class to store this data.

c. Add a toString method to WaterHeater which returns a string containing all the static and instance variables for a WaterHeater. You should break down the fee into the service charge plus the $20 mandatory city fee.

d. Add code to ServiceCallManager.java to test your new class. Make sure you can add service calls for water heaters to the list of todayServiceCalls.


*/

    @Test
    void testWaterHeaterClassStructure() throws Exception {
        // wow much reflection
        //
        //
        // Test for a new class called WaterHeater.
        // TODO should be a subclass of ServiceCall; have an age variable
        Class waterHeater = Class.forName("week_7.service_calls.WaterHeater");
    
        // TODO Static $20 extra charge variable
        
        
        // TODO toString method to WaterHeater which returns a String containing all the static
        // and instance variables for a WaterHeater. You should break down the fee into the
        // service charge plus the $20 mandatory city fee.
        
    
    
    
    }


}