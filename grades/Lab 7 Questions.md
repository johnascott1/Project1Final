# Lab 7 Inheritance, Abstract Classes

## Problem 1:

*Note that the Autograder is looking for exact variable/method names.*


The **Insect** class represents a generic insect species. We are going to specialize it with subclasses.

For the Insect class, please add 3 variables:

* A String called "name" to store the insect’s name. This variable should be protected
* An int called "wingCount" to store the number of wings. This variable should be protected
* A constant static int called "LEG_COUNT" to store the number of legs, and set it to 6. This variable should be public 

Add get and set methods for name and wingCount.

Think about: why are name and wingCount protected? Why is LEG_COUNT public, and why doesn't it need get and set methods? 

The **Butterfly** class represents a butterfly species. It will be a subclass of Insect.

Butterfly needs to extend Insect. Butterfly needs two new variables;

* A String called "wingColor" to store the butterfly’s wing color
* A String called "favoriteFlower" to store the butterfly’s favorite flower

Add get and set methods for wingColor and favoriteFlower variables.

Think about: should you make these variables public, private, package-protected, or protected? 
Do you need get and set methods for name and wingCount in Butterfly? Why or why not? 

Also, add a constructor that takes 4 arguments in this order: the butterfly’s name, number of wings, wing color, and favorite flower.

Also, add a method to the Butterfly class called speciesDataReport(). This method should **override** the method with the same name in Insect. In this method, print all the info for a Butterfly object – its name, wing color, number of wings, number of legs, and favorite flower.


The **Bee** class represents a bee species.  It will be a subclass of Insect.

Bee needs to have two variables:

* A String called "bodyColor" for the bee’s body color
* A boolean called "makesHoney" for whether this species of bee makes honey (not all bees do)

Think about: should you make these variables public, private, package-protected, or protected? 
Do you need get and set methods for name and wingCount in Bee? Why or why not? 

Add a constructor to set all the variables a Bee object, has in this order; name, number of wings, body color, makes honey.

And, bee needs a method called speciesDataReport() that prints out all of the data for a Bee species.  This method should **override** the method with the same name in Insect. This method has the same name as the Butterfly method, but prints out the Bee information. As it prints out the information, it should print “This bee does make honey” or “this bee does not make honey” instead of “true” or “false”.



**Use the *Question_1_Insect_Manager* class to create some Insect, Bee and Butterfly objects.**


Test your Butterfly class by writing code in the Question_1_InsectManager class to create some test Butterfly object. Create two Butterfly objects, and then call the speciesDataReport() method on each to display all the data for each of the Butterfly objects.


Suggestions: A Monarch butterfly has 4 wings, its wings are orange and black, and likes a plant called milkweed.
A Common Yellow Swallowtail butterfly has 4 wings, its wings are yellow and black, and likes a plant called milk parsley.


Test your Bee class by writing code in the InsectManager class to create some test Bee object. Create two Bee objects, and then call the speciesDataReport() method on each to display all the data for each of the Bee objects.

Suggestions: name = “Honey bee”, color = “yellow and black”, makes honey = true,  number of wings = 4
Name= “Bumble bee”, color = “yellow, black and white”, makes honey = false, number of wings = 4

Last task: Create an ArrayList or LinkedList of Insects. Add all of your Bee and Butterfly objects to this list.

Use a for each loop to iterate over your list and call speciesDataReport() for each Insect, perhaps like this,

```
LinkedList<Insect> insects = new LinkedList();

//Create and add some Butterfly and Bee objects to the list

for (Insect i : insects) {

   i.speciesDataReport();

}
```


So what's happening with the *abstract* Insect class? Can you make an Insect object? 


The first line of the class is 

`public **abstract** class Insect { //class definition follows`

And it contains an abstract method, 

`public **abstract** void speciesDataReport();`


So if you wrote code like 

`Insect i = new Insect();`

The compiler will report an error. An abstract class is one that you can't make objects from.  You can't make an Insect object from the Insect class.

You can subclass an abstract class, (create classes that declare that they are a subclass of Insect) and the subclasses can be used to make objects - you can make Bee and Butterfly objects.  Note that a Bee object is also an Insect object. A Butterfly object is also an Insect object.
 
So why is this useful? It's helpful in a scenario where you have a general description class, but you know that you will be specializing it with mre than one subclass; and only the subclasses will be do tasks in your program. You can now specify required behavior in the (abstract) superclass and enforce that the subclasses will need to have this behavior too.

It doesn't make much sense to make an Insect object. It's too vague to be useful in your program. But, it does make sense to create Bee or Butterfly objects. 

Abstract classes can define abstract methods. These are methods that you are requiring subclasses to have, but Insect doesn't need to decide exactly what it will do. So anything that subclasses Insect will be required to have a a speciesDataReport method, and each subclass can decide how it will be implemented - so each subclass can do it's own specific speciesDataReport. 

This is useful if you need to guarantee that all subclasses need to have a particular behavior. We'll see some more examples of this when we look at GUIs.

Imagine you don't have the `abstract speciesDataReport` in Insect. Comment it out, and then look at your loop in the InsectManager class. The compiler will be reporting an error. The loop is printing Bee and Butterfly data, and these classes both have speciesDataReport. So why does the compiler complain?

The Insect class doesn't have a method called speciesDataReport. While Bee and Butterfly both do, there is nothing to guarantee you won’t add an Insect object to this LinkedList, and Insect does not have this method.  So the compiler reports an error.

Insect doesn't want to implement speciesDataReport. It only represents general Insect objects, not a particular species - so it doesn't make sense to implement a real speciesDataReport. 

So, that's why we create an abstract speciesDataReport in Insect. “Abstract”, for the method, means that all Insect objects will have a method called speciesDataReport. But Insect doesn't want to define exactly what speciesDataReport does, and Insect doesn't need to implement it. 

So declare it as abstract in Insect, and the compiler will make sure all subclasses of Insect will create a speciesDataReport method. So, the compiler knows that every actual Insect object (in our case, Bee and Butterfly objects) will have to have an speciesDataReport. 

Notice that the class to speciesDataReport runs the method of that name for the correct type of Insect. It will calls the speciesDataReport from the Butterfly class if the Insect object in the list is a Butterfly, and it will call the speciesDataReport from the Bee class if the Insect object in the list is a Bee.


### Problem 2:


Run the program, and review the code.

There are a couple of new things:

* Input.java uses a TreeMap; which behaves like a HashMap but keeps the keys in order
* An Enum in the Furnace class. An Enum is a collection of named constants; useful if you know a 
variable can only have one of a defined number of values

Please make these changes to the program:

a. In your HVAC program, create a new class called WaterHeater. This represents a service call for a 
water heater. A water heater service call needs an address, date service requested, description of 
the problem, and the age of the water heater. Resolved service calls also need the resolved date, 
description of the resolution, and the fee charged to the customer. Note that many of these 
variables are already declared in ServiceCall, and a WaterHeater is a type of ServiceCall. 
So WaterHeater should be a subclass of ServiceCall, so it will have the same variables that 
ServiceCall does. You'll need to add the WaterHeater-specific variables. 

b. The city requires that all service calls to water heaters have a mandatory $20 extra charge added. 
As this applies to all water heaters, add a static variable called cityFee to your class to store this data.

c. Add a toString method to WaterHeater which returns a string containing all the static and 
instance variables for a WaterHeater. You should break down the fee into the service charge plus 
the $20 mandatory city fee.

d. Create a constructor to set the following variables, in this order: 
address, description of the problem, date reported, and the age of the water heater.

e. Add code to ServiceCallManager.java to test your new class. Make sure you can add service 
calls for water heaters to the list of today's ServiceCalls.


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

