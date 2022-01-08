package view.tm;

public class ReservationTM {
    private String resIdR;
    private String guestNameR;
    private String checkInR;
    private String checkOutR;
    private String roomNoR;
    private String mealPkgR;

    public ReservationTM() { }

    public ReservationTM(String resIdR, String guestNameR, String checkInR, String checkOutR, String roomNoR, String mealPkgR) {
        this.setResIdR(resIdR);
        this.setGuestNameR(guestNameR);
        this.setCheckInR(checkInR);
        this.setCheckOutR(checkOutR);
        this.setRoomNoR(roomNoR);
        this.setMealPkgR(mealPkgR);
    }

    public String getResIdR() {
        return resIdR;
    }

    public void setResIdR(String resIdR) {
        this.resIdR = resIdR;
    }

    public String getGuestNameR() {
        return guestNameR;
    }

    public void setGuestNameR(String guestNameR) {
        this.guestNameR = guestNameR;
    }

    public String getCheckInR() {
        return checkInR;
    }

    public void setCheckInR(String checkInR) {
        this.checkInR = checkInR;
    }

    public String getCheckOutR() {
        return checkOutR;
    }

    public void setCheckOutR(String checkOutR) {
        this.checkOutR = checkOutR;
    }

    public String getRoomNoR() {
        return roomNoR;
    }

    public void setRoomNoR(String roomNoR) {
        this.roomNoR = roomNoR;
    }

    public String getMealPkgR() {
        return mealPkgR;
    }

    public void setMealPkgR(String mealPkgR) {
        this.mealPkgR = mealPkgR;
    }
}
