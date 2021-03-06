/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aq.IGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Aq.IDataFacade;

/**
 *
 * @author Markb
 */
public class UI extends Application implements IGUI{
    
    private IDataFacade data;
    
    @Override
    public void injectData(IDataFacade datalayer) {
        this.data = datalayer;
    }

    @Override
    public void startApplication(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
