package week_7.ticket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class TicketFileIO {
    String openTicket = "open_tickets.txt";
    SimpleDateFormat filenameFormatter = new SimpleDateFormat("MMMM_dd_yyyy");
    Date date = new Date();   //defaults to today, right now
    String s = filenameFormatter.format(date);
// s will be in the format "September_28_2017"



    public void unresolvedTickets(LinkedList<Ticket> activeTickets) {
        try {
            BufferedWriter ticketWriter = new BufferedWriter(new FileWriter(openTicket));
        } catch (IOException ioIssues) {
            System.out.println("There was an issue reading to the file");
        }


    }

    public void resolvedTickets(LinkedList<Ticket> resolvedTickets){
        try{BufferedWriter resolvedWriter = new BufferedWriter(new FileWriter(s));}
        catch (IOException ioResolveIssues){
            System.out.println("There was an issue writing to the file.");
        }
    }
}