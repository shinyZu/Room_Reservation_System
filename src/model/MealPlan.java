package model;

import java.time.LocalDate;

public class MealPlan {
    private String newPlanCode;
    private String newMealPlan;
    private LocalDate newPlanOfferDate;
    private String newPlanPrice;

    public MealPlan() { }

    public MealPlan(String newPlanCode, String newMealPlan, LocalDate newPlanOfferDate, String newPlanPrice) {
        this.setNewPlanCode(newPlanCode);
        this.setNewMealPlan(newMealPlan);
        this.setNewPlanOfferDate(newPlanOfferDate);
        this.setNewPlanPrice(newPlanPrice);
    }

    public String getNewPlanCode() {
        return newPlanCode;
    }

    public void setNewPlanCode(String newPlanCode) {
        this.newPlanCode = newPlanCode;
    }

    public String getNewMealPlan() {
        return newMealPlan;
    }

    public void setNewMealPlan(String newMealPlan) {
        this.newMealPlan = newMealPlan;
    }

    public LocalDate getNewPlanOfferDate() {
        return newPlanOfferDate;
    }

    public void setNewPlanOfferDate(LocalDate newPlanOfferDate) {
        this.newPlanOfferDate = newPlanOfferDate;
    }

    public String getNewPlanPrice() {
        return newPlanPrice;
    }

    public void setNewPlanPrice(String newPlanPrice) {
        this.newPlanPrice = newPlanPrice;
    }
}
