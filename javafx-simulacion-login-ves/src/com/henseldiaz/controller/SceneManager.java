/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.henseldiaz.controller;

import com.henseldiaz.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class SceneManager {
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager;
    
    private SceneManager(){
        
    }
    
    public void ventanaLogin(){
        try {
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            LoginView login = LoginView.getInstanciaLoginView();
            cambiarEscena(login, 450, 500);
            this.escenaPrincipal.setFill(Color.TRANSPARENT);
            new LoginController (login);
            
        }catch (NullPointerException objetoNulo){
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar escena");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre){
            JOptionPane.showMessageDialog(null, "Error padre: Cambiar Escena");
            errorPadre.printStackTrace();
        }
    }
    
    public void cambiarEscena(Pane panel, int ancho, int alto){
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();
        } catch (NullPointerException objetoNulo){
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar escena");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre){
            JOptionPane.showMessageDialog(null, "Error padre: Cambiar Escena");
            errorPadre.printStackTrace();
        }
    }
    
    public static SceneManager getInstanciaSceneManager(){
        if( instanciaSceneManager == null)
            instanciaSceneManager = new SceneManager();
        return instanciaSceneManager;
    }
    
    public static void setInstanciaSceneManager(SceneManager instanciaSceneManagerController){
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

    public Stage getEscnarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscnarioPrincipal(Stage escnarioPrincipal) {
        this.escenarioPrincipal = escnarioPrincipal;
    }

    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }

    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }

    public Scene getEscenarioPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    
}
