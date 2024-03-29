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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author yduong
 */
public class BillController implements Initializable {

    @FXML
    private TextField textField;
    @FXML
    private Button submit;
    @FXML
    private ChoiceBox<?> type;
    @FXML
    private TextArea textArea;
    @FXML
    private Button add;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        type.setValue("Types of Bill");
        type.getItems().add("Mortgage");
        type.getItems().add("Electric");
        type.getItems().add("Water");
        type.getItems().add("Phone");
        type.getItems().add("Internet");
        type.getItems().add("Others");
    }    

    @FXML
    private void onSubmit(ActionEvent event) {
        try {
            //String bill = "Average living expenses per month: $" + textField.getText();
            /*File file = new File("text.txt");
            if (!file.exists()){
                file.createNewFile();
            }*/
            BufferedWriter writer = new BufferedWriter (new FileWriter ("text.txt",true));
            writer.newLine();
            writer.write("Average living expense per month: $" + textField.getText());
            writer.close();
            
            Stage stage = (Stage) submit.getScene().getWindow();
            FXMLLoader main = new FXMLLoader(getClass().getResource("Main.fxml"));
            Parent root = main.load();

            FXMLDocumentController controller = main.getController();
            controller.appendText();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*private void setText(String bill) {
        textField.appendText(bill);
    
    }*/

    @FXML
    private void onAdd(ActionEvent event) {
        ChoiceBox<String> newType = new ChoiceBox();
        newType.setValue("Types of Bill");
        newType.getItems().add("Mortgage");
        newType.getItems().add("Electric");
        newType.getItems().add("Water");
        newType.getItems().add("Phone");
        newType.getItems().add("Internet");
        newType.getItems().add("Others");
    }
    
}
