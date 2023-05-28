import java.math.BigDecimal;

public class Room {
    int numberOfRoom;
    int numberOfBed;
    boolean isThereBalcony;
    boolean isThereSeaView;
    BigDecimal priceForOneNight;

    public Room(int numberOfRoom, int numberOfBed, boolean isThereBalcony, boolean isThereSeaView, BigDecimal priceForOneNight){
        this.numberOfRoom = numberOfRoom;
        this.numberOfBed = numberOfBed;
        this.isThereBalcony = isThereBalcony;
        this.isThereSeaView = isThereSeaView;
        this.priceForOneNight = priceForOneNight;
    }


    //GETTERY A SETTERY
    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public boolean isThereBalcony() {
        return isThereBalcony;
    }

    public void setThereBalcony(boolean thereBalcony) {
        isThereBalcony = thereBalcony;
    }

    public boolean isThereSeaView() {
        return isThereSeaView;
    }

    public void setThereSeaView(boolean thereSeaView) {
        isThereSeaView = thereSeaView;
    }

    public BigDecimal getPriceForOneNight() {
        return priceForOneNight;
    }

    public void setPriceForOneNight(BigDecimal priceForOneNight) {
        this.priceForOneNight = priceForOneNight;
    }
}
