import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String personName = "";
      int counter = 0;
      int youPosition = 0;

      Queue<String> peopleInQueue = new LinkedList<String>();
      
      personName = scnr.nextLine();
      while (!personName.equals("-1")) {
         peopleInQueue.add(personName); // Add personName to peopleInQueue
         if (personName.equals("You")) {
            youPosition = peopleInQueue.size(); // Determine position of "You"
         }
         personName = scnr.nextLine();
      }

      System.out.println("Welcome to the ticketing service... ");
      System.out.println("You are number " + youPosition + " in the queue.");

      // Remove each person from the queue until "You" is at the head
      while (!peopleInQueue.peek().equals("You")) {
         String nextPerson = peopleInQueue.poll();
         System.out.println(nextPerson + " has purchased a ticket.");
         youPosition--; // Decrement your position in the queue
         System.out.println("You are now number " + youPosition);
      }

      // Output that you can purchase your ticket
      System.out.println("You can now purchase your ticket!");
   }
}
