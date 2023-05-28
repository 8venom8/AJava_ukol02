import java.util.List;

public class Booking {
    String dateOfVacation;
    int numberOfPeopleToRoom;
    boolean isVacationWork;
    List<Guest> guests;

    Guest guest1;
    Guest guest2;

    //PŘEVÁDĚNÍ NA STRING
    @Override
    public String toString() {
        return "Booking: [Datum pobytu: " + dateOfVacation + ", pocet lidí: " + numberOfPeopleToRoom + ", typ pobytu/pracovní: " + isVacationWork + "]";
    }

    //KONSTRUKTORY

    public Booking(String dateOfVacation, int numberOfPeopleToRoom) {
        this.dateOfVacation = dateOfVacation;
        this.numberOfPeopleToRoom = numberOfPeopleToRoom;
    }

    public Booking(String dateOfVacation, int numberOfPeopleToRoom, boolean isVacationWork) {
        this.dateOfVacation = dateOfVacation;
        this.numberOfPeopleToRoom = numberOfPeopleToRoom;
        this.isVacationWork = isVacationWork;
    }

    //SETTERY A GETTERY



    public Guest getGuest1() {
        return guest1;
    }

    public void setGuests(Guest guest1, Guest guest2) {
        this.guest1 = guest1;
        this.guest1 = guest2;
    }
    public void setGuest1(Guest guest1) {
        this.guest1 = guest1;
    }

    public Guest getGuest2() {
        return guest2;
    }

    public void setGuest2(Guest guest2) {
        this.guest2 = guest2;
    }



    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public String getDateOfVacation() {
        return dateOfVacation;
    }

    public void setDateOfVacation(String dateOfVacation) {
        this.dateOfVacation = dateOfVacation;
    }

    public int getNumberOfPeopleToRoom() {
        return numberOfPeopleToRoom;
    }

    public void setNumberOfPeopleToRoom(int numberOfPeopleToRoom) {
        this.numberOfPeopleToRoom = numberOfPeopleToRoom;
    }

    public boolean isVacationWork() {
        return isVacationWork;
    }

    public void setVacationWork(boolean vacationWork) {
        isVacationWork = vacationWork;
    }
}
