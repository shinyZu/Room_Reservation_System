package view.tm;

import javafx.scene.control.Button;

public class RoomTM {
    private String floorNoA;
    private String roomNoA;
    private String roomTypeA;
    private String capacityA;
    private String bedTypeA;
    private String noOfBedsA;
    private String roomStatusA;
    private String roomPriceA;
    private String specialOfferA;
    private Button btnRemoveA;

    public RoomTM() { }

    public RoomTM(String floorNoA, String roomNoA, String roomTypeA, String capacityA, String bedTypeA, String noOfBedsA, String roomStatusA, String roomPriceA, String specialOfferA, Button btnRemoveA) {
        this.setFloorNoA(floorNoA);
        this.setRoomNoA(roomNoA);
        this.setRoomTypeA(roomTypeA);
        this.setCapacityA(capacityA);
        this.setBedTypeA(bedTypeA);
        this.setNoOfBedsA(noOfBedsA);
        this.setRoomStatusA(roomStatusA);
        this.setRoomPriceA(roomPriceA);
        this.setSpecialOfferA(specialOfferA);
        this.setBtnRemoveA(btnRemoveA);
    }

    public String getFloorNoA() {
        return floorNoA;
    }

    public void setFloorNoA(String floorNoA) {
        this.floorNoA = floorNoA;
    }

    public String getRoomNoA() {
        return roomNoA;
    }

    public void setRoomNoA(String roomNoA) {
        this.roomNoA = roomNoA;
    }

    public String getRoomTypeA() {
        return roomTypeA;
    }

    public void setRoomTypeA(String roomTypeA) {
        this.roomTypeA = roomTypeA;
    }

    public String getCapacityA() {
        return capacityA;
    }

    public void setCapacityA(String capacityA) {
        this.capacityA = capacityA;
    }

    public String getBedTypeA() {
        return bedTypeA;
    }

    public void setBedTypeA(String bedTypeA) {
        this.bedTypeA = bedTypeA;
    }

    public String getNoOfBedsA() {
        return noOfBedsA;
    }

    public void setNoOfBedsA(String noOfBedsA) {
        this.noOfBedsA = noOfBedsA;
    }

    public String getRoomStatusA() {
        return roomStatusA;
    }

    public void setRoomStatusA(String roomStatusA) {
        this.roomStatusA = roomStatusA;
    }

    public String getRoomPriceA() {
        return roomPriceA;
    }

    public void setRoomPriceA(String roomPriceA) {
        this.roomPriceA = roomPriceA;
    }

    public String getSpecialOfferA() {
        return specialOfferA;
    }

    public void setSpecialOfferA(String specialOfferA) {
        this.specialOfferA = specialOfferA;
    }

    public Button getBtnRemoveA() {
        return btnRemoveA;
    }

    public void setBtnRemoveA(Button btnRemoveA) {
        this.btnRemoveA = btnRemoveA;
    }
}
