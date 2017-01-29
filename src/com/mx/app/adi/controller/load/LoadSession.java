/*
Inicio de la Sesion para el almacenamiento de todos los archivos durante el uso del progrma
 */
package com.mx.app.adi.controller.load;

import com.mx.app.adi.model.thread.InitSession;
import com.mx.app.adi.view.GUILogo;

public class LoadSession {
   
    public void init(GUILogo logo){
        // Inicio del hilo
        InitSession initSession = new InitSession(logo);
        initSession.start();
    }

}
