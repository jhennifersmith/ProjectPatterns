/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 20211STADS024
 */
public class Display implements Observer {

    Observable dadosDoSensor;
    public Display(Observable DadosDoSensor) {
    this.dadosDoSensor = DadosDoSensor;
    dadosDoSensor.addObserver(this);
}

@Override
public void update(Observable o, Object arg) {
    if (o instanceof SensorDeTemperatura ) {
    SensorDeTemperatura sdt = (SensorDeTemperatura) o;
    DisplayTemperatura tdt = new DisplayTemperatura();
}
}
}
