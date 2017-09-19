package week_7.ticket;

import java.util.TreeMap;



/** The instruction are in grades/Lab 7 Questions.md  */


public class Question_3_Support_Ticket_Manager {
    
    
    public static void main(String[] args) {
        new Question_3_Support_Ticket_Manager().manage();
    }
    
    
    // Constants used to display menu options, and figure out what user entered.
    static final int ADD_TICKET = 1;
    static final int SEARCH_BY_ID = 2;
    static final int DELETE_BY_TICKET_ID = 3;
    static final int SHOW_NEXT_TICKET = 4;
    static final int SHOW_ALL_TICKETS = 5;
    static final int QUIT = 9;
    
    // Global objects - the data store, and the user interface
    private TicketStore ticketStore = new TicketStore();
    private TicketUI ticketUI = new TicketUI();
    
    
    void manage() {
        
        TreeMap<Integer, String> options = configureMenuOptions();
    
        loadTickets();
        
        boolean quit = false;
    
        while (!quit) {
        
            int userChoice = ticketUI.showMenuGetChoice(options);
        
            switch (userChoice) {
                case ADD_TICKET:
                    addTicket();
                case SEARCH_BY_ID:
                    searchById();
                case DELETE_BY_TICKET_ID:
                    deleteById();
                case SHOW_NEXT_TICKET:
                    showNextTicket();
                case SHOW_ALL_TICKETS:
                    displayAllTickets();
                case QUIT:
                    quitProgram();
                    quit = true;
            }
        }
    }
    
    
    protected void loadTickets() {
        //TODO problem 7 load open tickets from a file, using your new TicketFileIO class
    }
    
    
    protected void addTicket() {
        // Get ticket data from user interface
        Ticket newTicket = ticketUI.getNewTicketInfo();
        // Add to the ticket store
        ticketStore.add(newTicket);
        ticketUI.userMessage("Ticket added to the ticket queue");
    }
    
    
    protected void searchById() {
        
        int ticketID = ticketUI.getTicketID();
        Ticket ticket = ticketStore.getTicketById(ticketID);
        if (ticket == null) {
            ticketUI.userMessage("No ticket found with that ID");
        } else {
            ticketUI.displayTicket(ticket);
        }
    }


    protected void deleteById() {
        // Get a ticket ID
        int ticketID = ticketUI.getTicketID();
        
        Ticket toDelete = ticketStore.getTicketById(ticketID);
        ticketUI.displayTicket(toDelete);
        
        // Confirm before delete
        if (ticketUI.areYouSure("Delete the above ticket, are you sure?")) {
            boolean deleted = ticketStore.deleteTicketById(ticketID);
            if (deleted) {
                ticketUI.userMessage("Ticket deleted");
            } else {
                ticketUI.userMessage("Ticket with this ID not found in the ticket queue");
            }
        } else {
            ticketUI.userMessage("No ticket deleted.");
        }
    }
    
    
    protected void searchByDescription() {
        
        // TODO problem 3 implement this method.
        
        // Use TicketUI method to ask user for search term e.g. "server" or "powerpoint"
        // Create a method in TicketStore to get list of matching Tickets for a search term;
        //      this method should return a list of all tickets which contain the user's
        //      search term in their description
        // Use TicketUI method to print the list of matching tickets
        
    }
    
    
    protected void deleteTicketByDescription() {
        
        // TODO problem 4 implement this method.
        // Ask user for search term e.g. "server"
    
        // If there are matching tickets, use TicketUI to ask user which ticket ID to delete;
        //      Use TicketStore method to delete this ticket
    
        // else, use TicketUI to show user 'not found' message
    
        }
    
    
    
    protected void showNextTicket() {
        Ticket next = ticketStore.peekNextTicket();
        ticketUI.displayTicket(next);
    }
    
    
    protected void displayAllTickets() {
        ticketUI.displayTickets(ticketStore.getAllTickets());
    }
    
    
    protected void quitProgram() {
        
        //TODO Problem 6 use your new TicketFileIO class to save all open tickets to a file; save all resolved tickets to a separate file
    }
    
    
    private TreeMap<Integer,String> configureMenuOptions() {
        
        TreeMap<Integer, String> options = new TreeMap<>();
        options.put(ADD_TICKET, "Add new ticket");
        options.put(DELETE_BY_TICKET_ID, "Delete ticket by ID");
        options.put(SHOW_NEXT_TICKET, "Show next ticket in ticket queue");
        options.put(SHOW_ALL_TICKETS, "Show all open tickets");
        options.put(QUIT, "Save and quit");
        
        return options;
    }
    
    
}

