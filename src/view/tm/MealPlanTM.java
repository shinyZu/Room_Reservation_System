package view.tm;

import javafx.scene.control.Button;

import java.time.LocalDate;

public class MealPlanTM {
    private String planCode;
    private String mealPlan;
    private LocalDate planOfferDate;
    private String mealPrice;
    private Button btnEdit;
    private Button btnRemove;

    public MealPlanTM() { }

    public MealPlanTM(String planCode, String mealPlan, LocalDate planOfferDate, String mealPrice, Button btnEdit, Button btnRemove) {
        this.setPlanCode(planCode);
        this.setMealPlan(mealPlan);
        this.setPlanOfferDate(planOfferDate);
        this.setMealPrice(mealPrice);
        this.setBtnEdit(btnEdit);
        this.setBtnRemove(btnRemove);
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public LocalDate getPlanOfferDate() {
        return planOfferDate;
    }

    public void setPlanOfferDate(LocalDate planOfferDate) {
        this.planOfferDate = planOfferDate;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public Button getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(Button btnEdit) {
        this.btnEdit = btnEdit;
    }

    public Button getBtnRemove() {
        return btnRemove;
    }

    public void setBtnRemove(Button btnRemove) {
        this.btnRemove = btnRemove;
    }
}
