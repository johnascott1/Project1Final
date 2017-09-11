package week_7.ticket;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TicketTest {
    
    @Test
    public void testSearchDescription() throws Exception {}
        
//        Question_3_Support_Ticket_Manager manager = new Question_3_Support_Ticket_Manager();
//
//        Ticket testPr1 = new Ticket("The server is on fire", 1, "1", new Date());
//        Ticket testPr2 = new Ticket("Server keeps rebooting", 2, "2", new Date());
//        Ticket testPr3 = new Ticket("Mouse mat stolen", 3, "3", new Date());
//
//        //Add these tickets
//        manager.addTicketInPriorityOrder(testPr1);
//        manager.addTicketInPriorityOrder(testPr2);
//        manager.addTicketInPriorityOrder(testPr3);
//
//        //Search for "server". Should return 1 and 2
//        LinkedList<Ticket> searchResults = manager.searchDescription("server");
//        assertTrue(searchResults.contains(testPr1));
//        assertTrue(searchResults.contains(testPr2));
//        assertEquals(2, searchResults.size());
//
//        //Search for "Server". Should return 1 and 2
//        searchResults = manager.searchDescription("Server");
//        assertTrue(searchResults.contains(testPr1));
//        assertTrue(searchResults.contains(testPr2));
//        assertEquals(2, searchResults.size());
//
//        //Search for "SERVER". Should return 1 and 2
//        searchResults = manager.searchDescription("SERVER");
//        assertTrue(searchResults.contains(testPr1));
//        assertTrue(searchResults.contains(testPr2));
//        assertEquals(2, searchResults.size());
//
//        //Search for "mouse". Should return 3
//        searchResults = manager.searchDescription("mouse");
//        assertTrue(searchResults.contains(testPr3));
//        assertEquals(1, searchResults.size());
//
//        //Search for "mouse mat". Should return 3
//        searchResults = manager.searchDescription("mouse mat");
//        assertTrue(searchResults.contains(testPr3));
//        assertEquals(1, searchResults.size());
//
//        //Search for "taco". Should return nothing
//        searchResults = manager.searchDescription("taco");
//        assertEquals(0, searchResults.size());
//
//    }
//
//
//
//    @Test
//    public void testDeleteTicketByIssue() throws Exception {
//
//        Question_3_Support_Ticket_Manager manager = new Question_3_Support_Ticket_Manager();
//
//        Ticket testPr1 = new Ticket("The server is on fire", 1, "1", new Date());
//        Ticket testPr2 = new Ticket("Server keeps rebooting", 2, "2", new Date());
//        Ticket testPr3 = new Ticket("Mouse mat stolen", 3, "3", new Date());
//
//        //Add these tickets
//        manager.addTicketInPriorityOrder(testPr1);
//        manager.addTicketInPriorityOrder(testPr2);
//        manager.addTicketInPriorityOrder(testPr3);
//
//        // Enter string "Server"
//        // Enter id 2
//        String[] data = {"Server", "2"};
//        setInputs(data);
//        // Verify 2 is gone
//
//        // Delete
//        manager.deleteTicketByIssue();
//
//        assertTrue(manager.ticketQueue.contains(testPr1));
//        assertTrue(manager.ticketQueue.contains(testPr3));
//        // and 2 is gone
//        assertFalse(manager.ticketQueue.contains(testPr2));
//        assertEquals(2, manager.ticketQueue.size());
//
//
//        // Delete a ticket NOT in the search results
//
//        manager = new Question_3_Support_Ticket_Manager();
//
//        manager.addTicketInPriorityOrder(testPr1);
//        manager.addTicketInPriorityOrder(testPr2);
//        manager.addTicketInPriorityOrder(testPr3);
//
//        // Enter string "Tacos"
//        // Enter a number
//        // Nothing should be deleted
//        String[] data2 = {"Tacos", "2"};
//        setInputs(data2);
//
//        // Verify no results
//
//        // Delete
//        manager.deleteTicketByIssue();
//
//        // All tickets still in ticket queue
//        assertTrue(manager.ticketQueue.contains(testPr1));
//        assertTrue(manager.ticketQueue.contains(testPr2));
//        assertTrue(manager.ticketQueue.contains(testPr3));
//
//    }
//
//    @Test
//    public void testDeleteTicketById() throws Exception {
//
//        Question_3_Support_Ticket_Manager manager = new Question_3_Support_Ticket_Manager();
//
//        Ticket testPr1 = new Ticket("1", 1, "1", new Date());
//        Ticket testPr2 = new Ticket("2", 2, "2", new Date());
//        Ticket testPr3 = new Ticket("3", 3, "3", new Date());
//
//        //Add a ticket
//        manager.addTicketInPriorityOrder(testPr1);
//        manager.addTicketInPriorityOrder(testPr2);
//        manager.addTicketInPriorityOrder(testPr3);
//
//        assertEquals(3, manager.ticketQueue.size());
//
//        //Override the default input. A ticket that's there, a ticket that isn't, a ticket that is, another ticket that is, an input for an empty list
//        int[] idInput = {2, 6, 1, 3, 3};
//        setInputs(idInput);
//
//        manager.deleteTicketById();     // delete 2
//
//        // Assert list contains 1 and 3
//        assertTrue(manager.ticketQueue.contains(testPr1));
//        assertTrue(manager.ticketQueue.contains(testPr3));
//        // and 2 is gone
//        assertFalse(manager.ticketQueue.contains(testPr2));
//        assertEquals(2, manager.ticketQueue.size());
//
//
//        manager.deleteTicketById();     // Deletes 6 - not in list
//
//        // Assert list still contains 1 and 3
//        assertTrue(manager.ticketQueue.contains(testPr1));
//        assertTrue(manager.ticketQueue.contains(testPr3));
//        // and 2 is still gone
//        assertFalse(manager.ticketQueue.contains(testPr2));
//        assertEquals(2, manager.ticketQueue.size());
//
//
//        manager.deleteTicketById();    // delete 1
//
//        // Assert list still contains 3
//        assertTrue(manager.ticketQueue.contains(testPr3));
//        // and 1 and 2 are gone
//        assertFalse(manager.ticketQueue.contains(testPr1));
//        assertFalse(manager.ticketQueue.contains(testPr2));
//        assertEquals(1, manager.ticketQueue.size());
//
//
//        manager.deleteTicketById();     //delete 3
//        // 1 and 2 and 3 are gone
//        assertFalse(manager.ticketQueue.contains(testPr3));
//        assertFalse(manager.ticketQueue.contains(testPr1));
//        assertFalse(manager.ticketQueue.contains(testPr2));
//        assertEquals(0, manager.ticketQueue.size());
//
//        // And then this should not crash
//        manager.deleteTicketById();     // delete 3 (non-existent)
//        assertFalse(manager.ticketQueue.contains(testPr3));
//        assertFalse(manager.ticketQueue.contains(testPr1));
//        assertFalse(manager.ticketQueue.contains(testPr2));
//        assertEquals(0, manager.ticketQueue.size());
//
//    }
//
//
//
//    @Test
//    public void testAddTicketInPriorityOrder() throws Exception {
//
//        Question_3_Support_Ticket_Manager manager = new Question_3_Support_Ticket_Manager();
//        Ticket testPr1 = new Ticket("1", 1, "1", new Date());
//        Ticket testPr2 = new Ticket("2", 2, "2", new Date());
//        Ticket testPr3 = new Ticket("3", 3, "3", new Date());
//        Ticket testPr4 = new Ticket("4", 4, "4", new Date());
//        Ticket testPr5 = new Ticket("5", 5, "5", new Date());
//
//        //Add a ticket
//        manager.addTicketInPriorityOrder(testPr2);
//        assertEquals(manager.ticketQueue.size(), 1);
//
//        // And another ticket with greater priority,
//        // which should be *before* this one in the list
//        manager.addTicketInPriorityOrder(testPr4);
//        // There should be two tickets in the list
//        assertEquals(manager.ticketQueue.size(), 2);
//
//        // The first one is the higher priority, the second one has lower priority
//        assertEquals(manager.ticketQueue.get(0), testPr4);
//        assertEquals(manager.ticketQueue.get(1), testPr2);
//
//        // add another ticket with priority 3, should be in the middle
//        manager.addTicketInPriorityOrder(testPr3);
//        // There should be three tickets in the list
//        assertEquals(manager.ticketQueue.size(), 3);
//
//        // The first one is the higher priority, the second one has lower priority
//        assertEquals(manager.ticketQueue.get(0), testPr4);
//        assertEquals(manager.ticketQueue.get(1), testPr3);
//        assertEquals(manager.ticketQueue.get(2), testPr2);
//
//
//        // add another ticket with priority 1, should be at the end
//        manager.addTicketInPriorityOrder(testPr1);
//        assertEquals(manager.ticketQueue.size(), 4);
//
//        assertEquals(manager.ticketQueue.get(0), testPr4);
//        assertEquals(manager.ticketQueue.get(1), testPr3);
//        assertEquals(manager.ticketQueue.get(2), testPr2);
//        assertEquals(manager.ticketQueue.get(3), testPr1);
//
//        // add another ticket with priority 5, should be at the start
//        manager.addTicketInPriorityOrder(testPr5);
//        assertEquals(manager.ticketQueue.size(), 5);
//
//        assertEquals(manager.ticketQueue.get(0), testPr5);
//        assertEquals(manager.ticketQueue.get(1), testPr4);
//        assertEquals(manager.ticketQueue.get(2), testPr3);
//        assertEquals(manager.ticketQueue.get(3), testPr2);
//        assertEquals(manager.ticketQueue.get(4), testPr1);
//
//        Ticket testPr5_again = new Ticket("5", 5, "5", new Date());
//
//        manager.addTicketInPriorityOrder(testPr5_again);
//
//        // The two priority 5 tickets should be at the start
//        // The order they are in, doesn't matter, as long as they
//        // are the top two
//
//        LinkedList selection = new LinkedList();
//        selection.add(manager.ticketQueue.get(0));
//        selection.add(manager.ticketQueue.get(1));
//
//        if (!selection.contains(testPr5)) {
//            fail("Pr 5 not in top two");
//        }
//
//        if (!selection.contains(testPr5_again)) {
//            fail("Pr 5_again not in top two");
//        }
//
//
//        // Add a priority 3, should be in the middle, at elements
//        // 3 and 4, in any order
//
//        Ticket testPr3_again = new Ticket("3", 3, "3", new Date());
//        manager.addTicketInPriorityOrder(testPr3_again);
//
//        selection.clear();
//
//        selection.add(manager.ticketQueue.get(3));
//        selection.add(manager.ticketQueue.get(4));
//
//        if (!selection.contains(testPr3)) {
//            fail("Pr 3 in the wrong place ");
//        }
//
//        if (!selection.contains(testPr3_again)) {
//            fail("Pr 3_again in the wrong place");
//        }
//    }
//
//    //Helper method to provide int input to the program
//    public void setInputs(int[] inputs) {
//
//        String input = "";
//        for (Integer i : inputs) {
//            input += i + "\n";
//        }
//
//        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//    }
//
//    //Helper method to provide String input to the program
//    public void setInputs(String[] inputs) {
//
//        String input = "";
//        for (String i : inputs) {
//            input += i + "\n";
//        }
//
//        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//    }
//
    
}