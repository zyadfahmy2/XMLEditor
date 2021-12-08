package com.example.xmleditor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.*;
import java.text.Normalizer;
import java.util.Scanner;

public class XMLEditor extends Application {
    Button button;
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("XML to JSON");
        button = new Button();
        button.setText("Open XML file");
        button.setOnAction(e->{

                    //System.out.println(Reader.Read());
                    // System.out.println(Formatter.format(Reader.Read()));
                   // String x = Formatter.format(Reader.Read());
                    //String x = Compression.compressFile(Reader.Read());
                    //Writer.write(x);
                    System.out.println(Formatter.format(Reader.Read()));
                   // System.out.println(x);
                    //System.out.println(Formatter.format(x));


        }
            );
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}