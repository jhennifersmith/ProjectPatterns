/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author 20211STADS024
 */
public class TelaAtualizacao extends Thread{
    private SensorTemperatura sensor;

    public TelaAtualizacao(SensorTemperatura sensor) {
        this.sensor = sensor;
    }
  
    @Override
    public void run(){
        while(sensor.isRodando()){
            System.out.println("\n\nAtualizando exibição:\n");
            
            try{
                Thread.sleep(5000);
            } catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
