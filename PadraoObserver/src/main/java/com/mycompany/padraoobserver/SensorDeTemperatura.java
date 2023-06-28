/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoobserver;

import java.util.Observable;

/**
 *
 * @author 20211STADS024
 */
class SensorDeTemperatura extends Observable {

    private int temperatura;
    int getTemperatura;

    public SensorDeTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    SensorDeTemperatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        setChanged();
        notifyObservers();
    }

    public int getTemperatura() {
        return temperatura;
    }

    
}
