/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sophmore.project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author yduong
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private ContextMenu context;
    @FXML
    private MenuItem copy;
    @FXML
    private Button submit;
    @FXML
    private Button income;
    @FXML
    private Button bill;
    @FXML
    private Button saving;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void onCopy(ActionEvent event) {
        textArea.copy();
    }

    @FXML
    private void onContext(ActionEvent event) {
    }

    @FXML
    private void onTextArea(MouseEvent event) {

    }

    @FXML
    private void onSubmit(ActionEvent event) {
        

    }

    @FXML
    private void onIncome(ActionEvent event) {
        try {
            Stage stage = (Stage) income.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Income.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onBill(ActionEvent event) {
        try {
            Stage stage = (Stage) bill.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Bill.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onSaving(ActionEvent event) {
        try {
            Stage stage = (Stage) saving.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Saving.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void appendText(String text) {
        textArea.appendText(text + "\n");    
    }
}
