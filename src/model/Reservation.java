package model;

public class Reservation {
    private String resId;
    private String guestName;
    private String checkIn;
    private String checkOut;
    private String roomNo;
    private String mealPkg;

    public Reservation() { }

    public Reservation(String resId, String guestName, String checkIn, String checkOut, String roomNo, String mealPkg) {
        this.setResId(resId);
        this.setGuestName(guestName);
        this.setCheckIn(checkIn);
        this.setCheckOut(checkOut);
        this.setRoomNo(roomNo);
        this.setMealPkg(mealPkg);
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getMealPkg() {
        return mealPkg;
    }

    public void setMealPkg(String mealPkg) {
        this.mealPkg = mealPkg;
    }
}
