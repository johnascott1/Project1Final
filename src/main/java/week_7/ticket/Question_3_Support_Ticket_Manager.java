package week_7.ticket;

/**
* Modify ITECCourse so that ITECCourse objects can store the room that the ticket meets in.

Should this variable be public, protected, or private?

Questions: What do public, protected, and private mean?

Why are these needed?

When do you use which?

Add get and set methods for this variable.

Modify ITECCourse's constructor so that you can specify the room when you create an ITECCourse object.

Modify writeCourseInfo so that it also prints the room.

Test your code by creating a ITECCourse object for this class:

Name: Info Tech Concepts, code 1100, max students 30, room T3050.

Enroll Max and Nancy and Orson.

Paste your Java code here:

Question: what will you do with the other ITECCourse objects that don't have a room yet?


Modify ITECCourseManager so that it adds all of the ITECCourse objects are stored in an ArrayList<ITECCourse>.

Add a method to ITECCourse that returns the number of free spaces in the class. So if the max number of students in a class is 30, and there are 10 students enrolled, this method will return 20.

Back in ITECCourseManager, loop over all of the ITECCourse objects and print the name of ticket and the number of free spaces in each.
*/

public class Question_3_Support_Ticket_Manager {
    public static void main(String[] args) {
        Question_3_Support_Ticket_Manager manager = new Question_3_Support_Ticket_Manager();
        manager.testCourseManagerMethods();
    }
    
    public void testCourseManagerMethods() {
    
        //Much less code!
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
    
        //Add some students.
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
    
        //Carl decided to drop the class...
        maintenanceCourse.removeStudent("Carl");
    
        maintenanceCourse.writeCourseInfo();
    
        // Can also get individual variable values with getter methods
        System.out.println("Course name is + " + maintenanceCourse.getName());
        System.out.println("Course code is + " + maintenanceCourse.getCode());
    
        System.out.println("Max students in the ticket is " + maintenanceCourse.getMaxStudents());
    
        //And can set variables, if set methods are provided
    
        //Let's increase the max number of students
    
        maintenanceCourse.setMaxStudents(24);
        System.out.println("The maximum number of students is now " + maintenanceCourse.getMaxStudents());
    
    
        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1424, 30);
    
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
    
        datacomCourse.writeCourseInfo();
    
    
        //Test the add students method with an example class
        // This class has a max of 3 students
        ITECCourse smallCourse = new ITECCourse("Made up name small class", 1234, 3);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        //We shouldn't be able to add another student – what happens?
        smallCourse.addStudent("Marigold");
    
    }
    
    
}

