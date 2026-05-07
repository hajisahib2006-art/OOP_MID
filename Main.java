import java.util.Scanner;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class CinemaTicket extends Person {
    private int seatNumber;
    private double ticketPrice;

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    
    public int getSeatNumber() {
        return seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void displayTicket() {
        System.out.println("\n===== Cinema Ticket =====");
        System.out.println("Customer Name : " + getName());
        System.out.println("Seat Number   : " + seatNumber);
        System.out.println("Ticket Price  : $" + ticketPrice);
        System.out.println("=========================");
    }
}


public class Main {

    public static void proceduralTicket(String name, int seat, double price) {

        System.out.println("\n===== Procedural Ticket =====");
        System.out.println("Customer Name : " + name);
        System.out.println("Seat Number   : " + seat);
        System.out.println("Ticket Price  : $" + price);
        System.out.println("=============================");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter Customer Name: ");
        String name = input.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = input.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = input.nextDouble();

        
        CinemaTicket customer = new CinemaTicket();

        customer.setName(name);
        customer.setSeatNumber(seat);
        customer.setTicketPrice(price);

        customer.displayTicket();

        proceduralTicket(name, seat, price);

        input.close();
    }
}