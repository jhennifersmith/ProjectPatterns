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
public class Principal {
    
    public static void main(String[] args){
        SensorTemperatura sensor = new SensorTemperatura();
        TelaAtualizacao tela = new TelaAtualizacao(sensor);
        
        sensor.start();
        tela.start();
        
        try{
            Thread.sleep(30000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
