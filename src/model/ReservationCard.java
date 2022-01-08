package model;

import java.time.*;

public class ReservationCard {
    private String newGuestName;
    private String newGuestNIC;
    private String newContactNo;
    private String newEmail;
    private String newAddress;
    private String newMealPkg;
    private LocalDate newDatePCheckInDate;
    private LocalTime newTimePCheckInTime;
    private LocalDate newDatePCheckOutDate;
    private LocalTime newTimePCheckOutTime;

    public ReservationCard() { }

    public ReservationCard(String newGuestName, String newGuestNIC, String newContactNo, String newEmail, String newAddress, String newMealPkg, LocalDate newDatePCheckInDate, LocalTime newTimePCheckInTime, LocalDate newDatePCheckOutDate, LocalTime newTimePCheckOutTime) {
        this.setNewGuestName(newGuestName);
        this.setNewGuestNIC(newGuestNIC);
        this.setNewContactNo(newContactNo);
        this.setNewEmail(newEmail);
        this.setNewAddress(newAddress);
        this.setNewMealPkg(newMealPkg);
        this.setNewDatePCheckInDate(newDatePCheckInDate);
        this.setNewTimePCheckInTime(newTimePCheckInTime);
        this.setNewDatePCheckOutDate(newDatePCheckOutDate);
        this.setNewTimePCheckOutTime(newTimePCheckOutTime);
    }

    public String getNewGuestName() {
        return newGuestName;
    }

    public void setNewGuestName(String newGuestName) {
        this.newGuestName = newGuestName;
    }

    public String getNewGuestNIC() {
        return newGuestNIC;
    }

    public void setNewGuestNIC(String newGuestNIC) {
        this.newGuestNIC = newGuestNIC;
    }

    public String getNewContactNo() {
        return newContactNo;
    }

    public void setNewContactNo(String newContactNo) {
        this.newContactNo = newContactNo;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getNewMealPkg() {
        return newMealPkg;
    }

    public void setNewMealPkg(String newMealPkg) {
        this.newMealPkg = newMealPkg;
    }

    public LocalDate getNewDatePCheckInDate() {
        return newDatePCheckInDate;
    }

    public void setNewDatePCheckInDate(LocalDate newDatePCheckInDate) {
        this.newDatePCheckInDate = newDatePCheckInDate;
    }

    public LocalTime getNewTimePCheckInTime() {
        return newTimePCheckInTime;
    }

    public void setNewTimePCheckInTime(LocalTime newTimePCheckInTime) {
        this.newTimePCheckInTime = newTimePCheckInTime;
    }

    public LocalDate getNewDatePCheckOutDate() {
        return newDatePCheckOutDate;
    }

    public void setNewDatePCheckOutDate(LocalDate newDatePCheckOutDate) {
        this.newDatePCheckOutDate = newDatePCheckOutDate;
    }

    public LocalTime getNewTimePCheckOutTime() {
        return newTimePCheckOutTime;
    }

    public void setNewTimePCheckOutTime(LocalTime newTimePCheckOutTime) {
        this.newTimePCheckOutTime = newTimePCheckOutTime;
    }
}
