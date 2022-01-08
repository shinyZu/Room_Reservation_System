package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.MealPlan;
import model.Room;
import view.tm.AvailableRoomTM;
import view.tm.MealPlanTM;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import static javafx.collections.FXCollections.observableArrayList;

public class MealPackageFormController {
    public AnchorPane contextMealPkg;
    public AnchorPane mealPlanContentPane;

    public TableView<MealPlanTM> tblMealPlan;
    public TableColumn colPlanCode;
    public TableColumn colMealPlan;
    public TableColumn colOfferDate;
    public TableColumn colPlanPrice;
    public TableColumn colEditPlan;
    public TableColumn colRemovePlan;

    public JFXTextField txtPlanCode;
    public JFXTextField txtMealPlan;
    public JFXDatePicker dateOffer;
    public JFXTextField txtPrice;
    public JFXButton btnAddOrEdit;

    static ArrayList<MealPlan> mealPlanArrayList = new ArrayList();

    public void goToAdminProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMealPkg.getChildren().add(load);
    }

    public void goToIncomeReportsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReportForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMealPkg.getChildren().add(load);
    }

    public void goToRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMealPkg.getChildren().add(load);
    }

    public void gotToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMealPkg.getChildren().add(load);
    }

    public void gotToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMealPkg.getChildren().add(load);
    }

    {
        mealPlanArrayList.add(new MealPlan("M001","Local", LocalDate.of(2000, 1, 23) ,"USD 10"));
        mealPlanArrayList.add(new MealPlan("M002","Chinese", LocalDate.of(2005, 3, 1) ,"USD 25"));
        mealPlanArrayList.add(new MealPlan("M003","French", LocalDate.of(2010, 6, 2) ,"USD 16"));

    }

    public boolean isExists(MealPlan mealPlan) {
        for (MealPlan plan : mealPlanArrayList) {
            if (plan.getNewPlanCode().equalsIgnoreCase(mealPlan.getNewPlanCode())) { // C001,c001 --> ignore case sensitiveness, equals()--> consider case sensitivity
                mealPlanArrayList.remove(plan);
                return true;
            }
        }
        return false;
    }

    public void addEditOnAction(ActionEvent actionEvent) {

       if (btnAddOrEdit.getText().equalsIgnoreCase("Add Plan")){
            // add
            MealPlan mealPlan = new MealPlan(txtPlanCode.getText(), txtMealPlan.getText(), dateOffer.getValue(), txtPrice.getText());
            //txtId.clear(); //to clear TextFields

            txtPlanCode.clear();
            txtMealPlan.clear();
            /*dateOffer.clear();*/
            txtPrice.clear();

            if (isExists(mealPlan)) {
                new Alert(Alert.AlertType.WARNING, "Already Exists..", ButtonType.CLOSE).show();

            }else{
                if (mealPlanArrayList.add(mealPlan)){  // ctrl + click
                    //alert --> add
                    loadAllPlans();
                    new Alert(Alert.AlertType.CONFIRMATION,"Meal Plan Added Successfully...", ButtonType.CLOSE).show();
                    btnAddOrEdit.setText("Add Plan");
                }else{
                    //alert -->try again
                    new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
                }
            }
        }
        if (btnAddOrEdit.getText().equalsIgnoreCase("Update")){
            // edit
            MealPlan mealPlanForEdit = new MealPlan(txtPlanCode.getText(), txtMealPlan.getText(), dateOffer.getValue(), txtPrice.getText());

            if (isExists(mealPlanForEdit)) {

                if (mealPlanArrayList.add(mealPlanForEdit)){  // ctrl + click
                    //alert --> update
                    loadAllPlans();
                    new Alert(Alert.AlertType.CONFIRMATION,"Meal Plan Updated Successfully...", ButtonType.CLOSE).show();
                    btnAddOrEdit.setText("Add Plan");
                }
            }
        }
    }

    private void loadAllPlans(){

        ObservableList<MealPlanTM> tmObservableList = FXCollections.observableArrayList();
        for (MealPlan temp: mealPlanArrayList) {

            Button btnEdit = new Button("Edit");
            Button btnRemove = new Button("Remove");

            tmObservableList.add(new MealPlanTM(temp.getNewPlanCode(), temp.getNewMealPlan(), temp.getNewPlanOfferDate(), temp.getNewPlanPrice(),btnEdit,btnRemove));

            btnRemove.setOnAction((e) -> {

                ButtonType yes= new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no= new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you sure you want to remove this Meal Plan?",yes,no);
                alert.setTitle("Confirmation Alert");

                /*1.8-->(windows null pointer exception)-->java-1.8*/
                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes){
                    mealPlanArrayList.remove(temp);
                    loadAllPlans();
                }else{

                }
            });

            btnEdit.setOnAction((e) -> {
                btnAddOrEdit.setText("Update");
            });
        }
        tblMealPlan.setItems(tmObservableList);
    }

    public void initialize() {
        ObservableList<MealPlanTM> tmInitialList = observableArrayList();

        colPlanCode.setCellValueFactory(new PropertyValueFactory<>("planCode"));
        colMealPlan.setCellValueFactory(new PropertyValueFactory<>("mealPlan"));
        colOfferDate.setCellValueFactory(new PropertyValueFactory<>("planOfferDate"));
        colPlanPrice.setCellValueFactory(new PropertyValueFactory<>("mealPrice"));
        colEditPlan.setCellValueFactory(new PropertyValueFactory<>("btnEdit"));
        colRemovePlan.setCellValueFactory(new PropertyValueFactory<>("btnRemove"));

        Button btnEdit = new Button("Edit");
        Button btnRemove = new Button("Remove");

        for (MealPlan m : mealPlanArrayList) {
            //tmInitialList.add(new AvailableRoomTM(room));

            tmInitialList.add(new MealPlanTM(m.getNewPlanCode(), m.getNewMealPlan(), m.getNewPlanOfferDate(), m.getNewPlanPrice(), btnEdit, btnRemove));
            tblMealPlan.setItems(tmInitialList);

            ///////////////////////////////////////////////////////////////////////////
            btnRemove.setOnAction((e) -> {

                ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to remove this Meal Plan?", yes, no);
                alert.setTitle("Confirmation Alert");

                /*1.8-->(windows null pointer exception)-->java-1.8*/
                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no) == yes) {
                    mealPlanArrayList.remove(m);
                    loadAllPlans();
                } else {

                }
            });
        }

        btnEdit.setOnAction((e) -> {
            btnAddOrEdit.setText("Update");
        });
///////////////////////////////////////////////////////////////////////////////////////
        tblMealPlan.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                /*System.out.println(oldValue+"OLD");
                System.out.println(newValue+"NEW");*/

            if (newValue == null) {
                //
            } else {
                try {
                    loadAllPlanData(newValue);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void loadAllPlanData(MealPlanTM tm) throws IOException {
        // loads data into the same interface/ same controller class

        txtPlanCode.setText(tm.getPlanCode());
        txtMealPlan.setText(tm.getMealPlan());
        dateOffer.setValue(tm.getPlanOfferDate());
        txtPrice.setText(tm.getMealPrice());


    }
}
