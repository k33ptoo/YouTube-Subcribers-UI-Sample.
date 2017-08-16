/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_subsmonitor;

import java.awt.Color;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author proxc
 */
public class JavaFX_SubsMonitor extends Application {
    private double xOffset = 0;
    private double yOffset = 0;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
          stage.initStyle(StageStyle.UNDECORATED);
             root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
        Scene scene = new Scene(root); stage.setScene(scene);
        Rectangle2D prD = Screen.getPrimary().getVisualBounds();
        //launch app on the right corner of screen
        stage.setX(prD.getMinX()+prD.getWidth() - 540);
        stage.setY(prD.getMinY()+prD.getHeight() - 205);
        stage.setHeight(200);
        
FadeTransition ft = new FadeTransition(Duration.millis(2000),root);
ft.setFromValue(0.5);
ft.setToValue(1.0);
ft.play();
        
        stage.setWidth(530);
       
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
