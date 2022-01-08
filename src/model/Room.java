package model;

public class Room {
    private String floorNo;
    private String roomNo;
    private String roomType;
    private String capacity;
    private String bedType;
    private String noOfBeds;
    private String roomStatus;
    private String roomPrice;
    private String specialOffer;

    public Room() {

    }

    public Room(String floorNo, String roomNo, String roomType, String capacity, String bedType, String noOfBeds, String roomStatus, String roomPrice, String specialOffer) {
        this.setFloorNo(floorNo);
        this.setRoomNo(roomNo);
        this.setRoomType(roomType);
        this.setCapacity(capacity);
        this.setBedType(bedType);
        this.setNoOfBeds(noOfBeds);
        this.setRoomStatus(roomStatus);
        this.setRoomPrice(roomPrice);
        this.setSpecialOffer(specialOffer);
    }


    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(String noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(String specialOffer) {
        this.specialOffer = specialOffer;
    }
}
