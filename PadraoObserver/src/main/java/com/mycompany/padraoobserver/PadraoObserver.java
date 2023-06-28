/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.padraoobserver;

import javax.swing.JOptionPane;

/**
 *
 * @author 20211STADS024
 */
public class PadraoObserver {

    public static void main(String[] args) {

        SensorDeTemperatura sdt = new SensorDeTemperatura();
        DisplayTemperatura display = new DisplayTemperatura(sdt);
        sdt.setTemperatura(35);
        JOptionPane.showMessageDialog(null, "Alteração");
        sdt.setTemperatura(32);

    }
}
