/*
Objecto tipo session que se mantiene viva durante todo el uso del programa
 */
package com.mx.app.adi.model.entities;

import java.io.Serializable;

public class Session implements Serializable{
    
    private int idSession;

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }
    
    
    
}
