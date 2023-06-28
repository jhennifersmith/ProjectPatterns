/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Random;

/**
 *
 * @author 20211STADS024
 */
public class SensorTemperatura extends Thread {
    private volatile boolean rodando;
    
    public SensorTemperatura(){
        this.rodando = true;
    }
    
    @Override
    public void run(){
        Random random = new Random();
        
        while(rodando){
            int temp = random.nextInt(45);
            System.out.println("A temperatura é: " + temp + "°C");
                    try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        }

    }
    
    public boolean isRodando() {
        return rodando;
    }
    
    public void pararSensor(){
        rodando = false;
    }
}
