package lk.ijse.sample.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import lk.ijse.sample.model.CustomerModel;
import lk.ijse.sample.repository.CustomerRepository;
import lk.ijse.sample.service.CustomerService;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerFormController implements Initializable {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNumber;

    private final StringProperty nameProp = new SimpleStringProperty();

    CustomerService customerService = new CustomerService();
    @FXML
    void saveBtnOnAction(ActionEvent event) {
        CustomerModel cm = new CustomerModel(txtName.getText(),txtAddress.getText(),txtNumber.getText());
        boolean isAdded = customerService.saveCustomer(cm);
        if (isAdded) {

        } else {

        }
    }

    @FXML
    void deleteBtnOnAction(ActionEvent event) {

    }

    @FXML
    void updateBtnOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameProp.set("212");
        txtName.textProperty().bind(nameProp);
    }
}
