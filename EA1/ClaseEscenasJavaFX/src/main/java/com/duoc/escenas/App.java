package com.duoc.escenas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application {
    //init = se ejecuta al principio
    @Override
    public void init(){
        System.out.println("1.preparando la aplicacion");
    }

    //Start = se ejecuta despues de init y sirve para crear la interfaz o lo visual UI
    @Override
    public void start(Stage stage) throws Exception{
        System.out.println("2. Start(); crando la Interfaz");

        //cargar la primera pantalla o vista

        FXMLLoader loaderInicio = new FXMLLoader(getClass().getResource("/views/inicio.fxml"));

        //Contruir la escene
        Parent rootInicio = loaderInicio.load();

        //crear escenario
        Scene escenaInicio = new Scene(rootInicio,500,300);

        //segunda escena

        //cargar la primera pantalla o vista

        FXMLLoader loaderPanel = new FXMLLoader(getClass().getResource("/views/panel.fxml"));

        //Contruir la escene
        Parent rootPanel = loaderPanel.load();

        //crear escenario
        Scene escenaPanel = new Scene(rootPanel,500,300);
        // almacenamos el CSS en una variable = css
        String css = getClass().getResource("/css/estilos.css").toExternalForm();
        //asignar el css a las vistas o pantalla
        escenaInicio.getStylesheets().add(css);
        escenaPanel.getStylesheets().add(css);
        //buscar los botones a las vistas

        Button btnEntrar = (Button) rootInicio.lookup("#btnEntrar");
        Button btnVolver = (Button) rootPanel.lookup("#btnVolver");

        //Asignar acciones a cada boton
        //-> funcion de flecha = funcion anonima y sin nombret que se ejecuta automaticamente
        btnEntrar.setOnAction(event ->
                stage.setScene(escenaPanel)
                );
        btnVolver.setOnAction(event ->
                stage.setScene(escenaInicio)
                );
        //crear la ventana principal Stage = 1 =cambia la escena
        stage.setTitle("Flujos de escenas de java FX");
        //la pantalla o view con la que quiero iniciar el programa
        stage.setScene(escenaInicio);
        //mostrar la intefaz
        stage.show();

    }
    //Stop = Se va a ejecutar cuando el usuario finalize la aplicacion
    @Override
    public  void stop(){
        System.out.println("3. Stop(). Aplicacion finalizada");
    }
    public static void main(String[] args){
        launch(args);
    }


}
