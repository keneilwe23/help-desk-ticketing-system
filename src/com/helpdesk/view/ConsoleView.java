package com.helpdesk.view;

import com.helpdesk.controller.TicketController;
import java.util.Scanner;

public class ConsoleView {
    private TicketController controller = new TicketController();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1. Create Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Update Ticket");
            System.out.println("4. Filter Tickets");
            System.out.println("4. System info");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String desc = scanner.nextLine();
                    controller.createTicket(title, desc);
                    break;

                case 2:
                    controller.viewTickets();
                    break;

                case 3:
                    System.out.print("Enter Ticket ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("New Status: ");
                    String status = scanner.nextLine();
                    controller.updateTicket(id, status);
                    break;

                case 4:
                    System.out.print("Enter status (Open, In Progress, Closed): ");
                    String status2 = scanner.nextLine();
                    controller.filterTickets(status2);
                    break;

                case 5:
                    return;
            }
        }
    }
}
