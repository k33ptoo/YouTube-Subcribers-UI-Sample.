/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_subsmonitor;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.AnchorPane;

/**
 *
 * @author proxc
 */
public class MainController implements Initializable {
    
    @FXML
    private AnchorPane subs, signin;
    
    @FXML
    private Label exit, exit1;
    
    @FXML
    private JFXButton btn_signin;
    
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
        
              
       
       if(event.getSource()== exit || event.getSource()== exit1)
       {
           System.exit(0);
       }
    }
    @FXML
    private void handleSignin(ActionEvent evt)
    {
           subs.toFront();
           signin.setVisible(false);
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
