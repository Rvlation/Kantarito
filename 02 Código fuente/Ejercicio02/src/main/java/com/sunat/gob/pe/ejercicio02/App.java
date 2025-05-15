package com.sunat.gob.pe.ejercicio02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        Button  botonAceptar = new Button("Aceptar") ;
        Button  botonCancelar = new Button("Cancelar") ;
        
        HBox hbox =new HBox (10,botonAceptar,botonCancelar);
        hbox.setPadding( new Insets(5));
        hbox.setAlignment(Pos.BASELINE_CENTER);
       
        var alineacionVertical = new Insets(0,0,0,15);
        
        Label labelDatos = new Label("Datos");
        labelDatos.setStyle("-fx-font-weight: bold");
        Label labelVentas = new Label("Ventas");
        labelVentas.setPadding(alineacionVertical);
        Label labelMarketing = new Label("Marketing");
         labelMarketing.setPadding(alineacionVertical);
        Label labelDistribucion = new Label("Distribucion");
         labelDistribucion.setPadding(alineacionVertical);
        Label labelCostos = new Label("Costos");
         labelCostos.setPadding(alineacionVertical);
        
        VBox vbox = new VBox (labelDatos,labelVentas,labelMarketing,labelDistribucion,labelCostos);
        
        Button botonResumen = new Button("Resumen") ;
        Button botonCreditos = new Button("Creditos") ;
        Button botonAhorros = new Button("Ahorros") ;
        Button botonMovimientos = new Button("Movimientos") ;
        Button botonDeudas = new Button("Deudas ") ;
        Button botonHistorial = new Button("Historial") ;
        
        GridPane gridpane =new GridPane();
        
        /*gridpane.add(botonResumen, 0, 0);
        gridpane.add(botonCreditos, 1, 0);
        gridpane.add(botonAhorros, 2, 0);
        gridpane.add(botonMovimientos, 0, 1);
        gridpane.add(botonDeudas, 1, 1);
        gridpane.add(botonHistorial, 2, 1);
          */
        HBox hboxf1 =new HBox(botonResumen,botonCreditos,botonAhorros);
        HBox hboxf2 =new HBox(botonMovimientos,botonDeudas,botonHistorial);
        
        gridpane.add(hboxf1, 0, 0);
        gridpane.add(hboxf2, 0, 1);
        
        var scene = new Scene(gridpane , 640, 480);
        
        stage.setScene(scene);
        stage.setTitle("APLICACION FX RLOPEZ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}