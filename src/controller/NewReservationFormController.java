package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Guest;
import model.Reservation;
import model.ReservationCard;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Optional;

public class NewReservationFormController {
    public AnchorPane newReservationContentPane;
    public JFXTextField txtNewGuestName;
    public JFXTextField txtNewNIC;
    public JFXTextField txtNewContactNo;
    public JFXTextField txtNewEmail;
    public JFXTextField txtNewAddress;
    public JFXComboBox<String> cmbNewMealPkg;
    public JFXDatePicker datePCheckInDate;
    public JFXTimePicker timePCheckInTime;
    public JFXDatePicker datePCheckOutDate;
    public JFXTimePicker timePCheckOutTime;

    public void initialize(){
        cmbNewMealPkg.getItems().addAll(
                "Local",
                "Chinese",
                "French"
        );
        /*datePCheckInDate.setValue(LocalDate.of(2021, 01, 01));
        datePCheckOutDate.setValue(LocalDate.of(2021, 01, 01));
        timePCheckInTime.setValue(LocalTime.of(00, 00, 00));
        timePCheckOutTime.setValue(LocalTime.of(00, 00, 00));*/
    }
    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) newReservationContentPane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReservationsForm.fxml"))));
    }

    public void reserveOnAction(ActionEvent actionEvent) throws IOException {
        /*Guest guest = new Guest(txtNewGuestName.getText(),txtNewNIC.getText(),txtNewContactNo.getText(),txtNewEmail.getText(),txtNewAddress.getText())*/

        ReservationCard card = new ReservationCard(txtNewGuestName.getText(),txtNewNIC.getText(),txtNewContactNo.getText(),
                txtNewEmail.getText(),txtNewAddress.getText(),cmbNewMealPkg.getValue(),
                datePCheckInDate.getValue(),timePCheckInTime.getValue(),datePCheckOutDate.getValue(),timePCheckOutTime.getValue());

        /*String am_pm = ((timePCheckInTime.getValue() < 12.00) || (timePCheckOutTime < 12)) ? "AM" : "PM";*/

        ButtonType print= new ButtonType("Print", ButtonBar.ButtonData.OK_DONE);
        ButtonType sendEmail= new ButtonType("Send Email", ButtonBar.ButtonData.OK_DONE);
        ButtonType close= new ButtonType("Close", ButtonBar.ButtonData.CANCEL_CLOSE);

        String msg = "Guest Name        :"+ card.getNewGuestName()+
                "\n\nNIC                :"+card.getNewGuestNIC()+
                "\n\nContact Number   :"+card.getNewContactNo()+
                "\n\nEmail               :"+card.getNewEmail()+
                "\n\nAddress             :"+card.getNewAddress()+
                "\n\nMeal Plan           :"+card.getNewMealPkg()+
                "\n\nCheck-In Date       :"+card.getNewDatePCheckInDate()+
                "\n\nCheck-In Time       :"+card.getNewTimePCheckInTime()+/*am_pm+*/
                "\n\nCheck-Out Date      :"+card.getNewDatePCheckOutDate()+
                "\n\nCheck-Out Time      :"+card.getNewTimePCheckOutTime()/*+am_pm*/+"\n\n\n";

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                msg,
                close,sendEmail,print);
        alert.setTitle("Reservation Card");
        /*1.8-->(windows null pointer exception)-->java-1.8*/
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(sendEmail)==print){
            /*studentList.remove(temp);
            loadAllStudents();
            URL resource = getClass().getResource("../view/ReservationsForm.fxml");
            Parent load = FXMLLoader.load(resource);
            //contextAdminRoom.getChildren().clear();
            newReservationContentPane.getChildren().add(load);*/
            Stage window = (Stage) newReservationContentPane.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReservationsForm.fxml"))));
        }else if(result.orElse(close)==sendEmail){
            Stage window = (Stage) newReservationContentPane.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReservationsForm.fxml"))));
        }else{

        }

    }
}
