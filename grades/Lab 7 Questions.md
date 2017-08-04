# Lab 7

###Problem 1:

Create a class called InsectManager. This class should have a main module and will be used to create Insect objects, and test your Insect classes (and subclasses, which you’ll create in a moment).

And, create a class called Insect. This will represent a generic insect species. We’ll specialize it with subclasses soon.

For the Insect class, please add 3 variables:

A String to store the insect’s name

An int to store the number of wings

A constant to store the number of legs, and set it to 6.

Will these be public, private, or protected?

Add get and set methods for the first 2 variables. What will you do with the constant? Make it public, or add a get method?

Next, create another new class called Butterfly. Butterfly needs to extend Insect. Butterfly needs two new variables;

A String to store the butterfly’s wing color

A String to store the butterfly’s favorite flower

Will these variablegit be public, private, or protected? Add get and set methods for these variables.

Also, please add a constructor that takes 4 arguments – the butterfly’s name, wing color, number of wings, and favorite flower.

Also, add a method to the Butterfly class called printSpeciesData. This method should print all the info for a Butterfly object – it’s name, wing color, number of wings, number of legs, and favorite flower.

Test your Butterfly class by writing code in the InsectManager class to create some test Butterfly object. Create two Butterfly objects, and then call the printSpeciesData method on each to display all the data for each of the Butterfly objects.

Suggestions: A Monarch butterfly has 6 legs, 4 wings, it is orange and black, and likes a plant called milkweed.

A Common Yellow Swallowtail butterfly has 6 legs, 4 wings, it is yellow and black, and likes a plant called milk parsley.

Next, create another subclass of Insect. This class should be called Bee. A Bee is a Bee, and a Bee is also an Insect.


Bee needs to have three variables:

A String for the bee’s color

A boolean for whether this species of bee makes honey (not all bees do)

A String for this bee’s favorite flower

Bee also needs a constructor to set all the variables a Bee object has. And, bee needs a method called printSpeciesData() that prints out all of the data for a Bee species. This method has the same name as the Butterfly method, but prints out the Bee information. As it prints out the information, it should print “This bee does make honey” or “this bee does not make honey” instead of “true” or “false”.

Test your Bee class by writing code in the InsectManager class to create some test Bee object. Create two Bee objects, and then call the printSpeciesData method on each to display all the data for each of the Bee objects.

Suggestions: name = “Honey bee”, color = “yellow and black”, makes honey = true, favorite flower = “Jasmine”, number of wings = 4

Name= “Bumble bee”, color = “yellow, black and white”, makes honey = False, favorite flower = “clover”, number of wings = 4

Last task: Create a LinkedList of Insects (recommended: use Generic types to require that the list can only contain Insect objects). Add all of your Bee and Butterfly objects to this list.

Use a for each loop to iterate over your list and call printSpeciesData for each Insect.

LinkedList insects = new LinkedList();

//Create and add some Butterfly and Bee objects to the list

for (Insect i : insects) {

i.printSpeciesData();

}

Unfortunately, this doesn’t work. The insect class does not have a method called printSpeciesData. While Bee and Butterfly both do, there is nothing to guarantee you won’t add an Insect object to this LinkedList, and Insect does not have this method. So the compiler complains.

To fix, please add this code to Insect class

public abstract void printSpeciesData();

And change the first line of the class from

public class Insect { //class definition follows

To

public abstract class Insect { //your class definition here

Now your code should work.

“Abstract”, for the method, means that all Insect objects will have a method called printSpeciesData. But Insect doesn’t want to define exactly what printSpeciesData does, and Insect doesn’t need to implement it. This is useful if you will never instantiate your superclass, if it doesn’t make sense to make objects from the superclass. In this program, it doesn’t make sense to make Insect objects, it’s only useful to make the Butterfly and Bee subclasses. But, you want every insect to have printSpeciesData. So declare it as Abstract in Insect, and the compiler will make sure all subclasses of Insect will create a printSpeciesData method.

You also need to change the class to an Abstract class. You can never make objects from an abstract class. After all, you haven’t written all the method definitions it needs.

This is useful in any scenario where you have a general description class, and then specialize it with many subclasses; and only the subclasses will be useful in your program. You can now specify more required behavior in the (abstract) superclass and enforce that the subclasses will be able to have this behavior too... helps with polymorphism.

Notice that printSpeciesData should call the method of that name for the correct type of insect – this is polymorphism! So it should call printSpeciesData from the Butterfly class if the Insect object in the list is a Butterfly, and it will call the printSpeciesData from the Bee class if the Insect object in the list is a Bee.

This example uses generic types to make the LinkedList only able to store Insect objects. Please see the Data Types lab for more information and examples on generic types.


Please paste your Java code here:

### Problem 2:

Fork and pull the HVAC service call program from

HYPERLINK "https://github.com/minneapolis-edu/HVAC" https://github.com/minneapolis-edu/ HYPERLINK "https://github.com/minneapolis-edu/HVAC" HVAC

Run the program, and review the code.

There are a couple of new things:

Input.java uses a TreeMap; which behaves like a HashMap but keeps the keys in order

An Enum in the Furnace class. An Enum is a collection of named constants; useful if you know a variable can only have one of a defined number of values

Please make these changes to the program:

a. In your HVAC program, create a new class called WaterHeater. This represents a service call for a water heater. A water heater service call needs an address, date service requested, description of the problem, and the age of the water heater. Resolved service calls also need the resolved date, description of the resolution, and the fee charged to the customer.

b. The city requires that all service calls to water heaters have a mandatory $20 extra charge added. As this applies to all water heaters, add a static variable to your class to store this data.

c. Add a toString method to WaterHeater which returns a string containing all the static and instance variables for a WaterHeater. You should break down the fee into the service charge plus the $20 mandatory city fee.

d. Add code to ServiceCallManager.java to test your new class. Make sure you can add service calls for water heaters to the list of todayServiceCalls.

Push your version of HVAC to your own GitHub account and paste the link to your repository here:

Please paste your Java code for HVAC.java and WaterHeater.java here

### Question 3 Support Ticket manager 


All of these questions refer to the support ticket application from "Java Programming Support Ticket Program" PowerPoint slides. Please follow through these slides and get the code running.

Run and test the program with some example support tickets.

Answer the questions from Problem 1 and Problem 5. For your code, when you have finished all the problems, paste in your code at the end AND push it to your GitHub repository.

Problem 1:

In your own words, Explain the role of the static and instance ticketID variables in the Ticket class. Why are a static variable, and an instance variable, declared in the class?

Problem 2:

Add code to the deleteTicket method; so if user enters a ticket ID that doesn’t exist, it prints an error message and asks the user to try again.

You should also validate that the user is not entering a String or double or something that is not an int. Again; the method should ask the user to enter the ticket ID again.)

Problem 3:

Modify the menu. Remove the Delete Ticket option. Replace it with 3 new options: Delete by ID, Delete by Issue, and Search by Issue.

Write ONE method, which searches your ticket list and returns a new list of Tickets whose descriptions contain a certain string. For example, you might want to search for all tickets with the word “server” in the description. Your method should return a list of all Tickets with “server” in the description.

Use this method to help you implement Search by Issue option.

Problem 4:

Now, implement Delete by Issue. Your user may want to search for all tickets with "Server" in the description, to see a list of those tickets and their IDs. At that point, they could enter an ID of the Ticket they want to delete.

Problem 5:

Modify your program so that Tickets can store another date – resolution date – and a String that documents why the ticket was closed – the fix or the resolution for the ticket.

Now assume that when users delete a ticket, it has been resolved in some way. Either you’ve fixed the problem, or the user has figured out how to change their own screensaver, or it’s become a non-issue in some other way.

Now, when you delete a Ticket, your program should ask the user for the resolution. It should store the resolution, plus the current date. Now, remove this Ticket from the ticketQueue list.

And, add this ticket to a new list, called resolvedTickets.

There are at least two ways of doing this:

Question: Would you rather subclass Ticket and create a new class called ResolvedTicket? Or modify the current Ticket class to add these two new variables? Why did you choose the approach that you used?

Problem 6: When the program closes, please write out all the data about all open tickets, and all resolved tickets, to files.

Resolved tickets should go into one file. This file should have today’s date in the filename. Something like “Resolved_tickets_as_of_february_14_2014.txt” perhaps?

Open tickets should go in another file called “open_tickets.txt”.

Problem 7: When you program opens, it should look for a file called open_tickets.txt. Read in this file, and create ticket objects, and store these in the ticketQueue list so the user can see all open tickets.

Problem 8: What happens to ticket IDs when the program is closed and opened? Make sure they don't reset to 1 when the user restarts the program.

