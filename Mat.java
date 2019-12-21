/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Float.*;
public class Mat extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        new frame().show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    

    
    
    
}
