package model;

public class Guest {
    private String guestNo;
    private String guestName;
    private String NIC;
    private String contactNo;
    private String guestEmail;
    private String guestAddress;
    private String resID;
    private String roomNo;

    public Guest() { }

    public Guest(String guestNo, String guestName, String NIC, String contactNo, String guestEmail, String guestAddress, String resID, String roomNo) {
        this.setGuestNo(guestNo);
        this.setGuestName(guestName);
        this.setNIC(NIC);
        this.setContactNo(contactNo);
        this.setGuestEmail(guestEmail);
        this.setGuestAddress(guestAddress);
        this.setResID(resID);
        this.setRoomNo(roomNo);
    }


    public String getGuestNo() {
        return guestNo;
    }

    public void setGuestNo(String guestNo) {
        this.guestNo = guestNo;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public String getGuestAddress() {
        return guestAddress;
    }

    public void setGuestAddress(String guestAddress) {
        this.guestAddress = guestAddress;
    }

    public String getResID() {
        return resID;
    }

    public void setResID(String resID) {
        this.resID = resID;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}
