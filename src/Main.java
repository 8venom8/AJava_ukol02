import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //HOSTI
        Guest firstGuest = new Guest("Adéla", "Malíková", LocalDate.of(1993,3,13) );
        Guest secondGuest = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5) );
        Guest thirdGuest = new Guest("Adam", "Javor", LocalDate.of(1990, 5, 8));

        System.out.println(firstGuest.getName() + " " + firstGuest.getLastName() + " " + "(" + firstGuest.getBirthDate() + ")");
        System.out.println(secondGuest.getName() + " " + secondGuest.getLastName() + " " + "(" + secondGuest.getBirthDate() + ")");

        //POKOJE
        Room firstRoom = new Room( 1, 1, true, true, BigDecimal.valueOf(1000));
        Room secondRoom = new Room( 2, 1, true, true, BigDecimal.valueOf(1000));
        Room thirdRoom = new Room( 3, 3, false, true, BigDecimal.valueOf(2400));


        //VYTVOŘENÍ SEZNAMU listOfBookings
        List<Booking> listOfBookings = new ArrayList<>();

        //VYTVOŘENÍ OBJEKTU BOOKING
        Booking bookingAdela = new Booking("19. - 26.7. 2021", 1);
        Booking bookingAdelaJan = new Booking("1. - 14.9.2021", 2);
        Booking bookingAdam = new Booking("3. -10.3.2023", 1);


        //PŘIDÁNÍ OBJEKTU DO SEZNAMU
        listOfBookings.add(bookingAdela);
        listOfBookings.add(bookingAdelaJan);
        listOfBookings.add(bookingAdam);

        //PŘIŘAZENÍ HOSTA K REZRVACI

        bookingAdela.setGuest1(firstGuest);
        bookingAdelaJan.setGuests(secondGuest, firstGuest);
        //bookingAdelaJan.setGuest();
        bookingAdam.setGuest1(thirdGuest);

        //List<Guest> guests = bookingAdelaJan.getGuests();

        //VYPSÁNÍ VŠECH REZERVACÍ
        for (Booking booking : listOfBookings) {
            Guest guest = booking.getGuest1();
            System.out.println("Booking: " + booking.getDateOfVacation() + ", Guests: " + guest.getName() + " " + guest.getLastName());
        }
}
}