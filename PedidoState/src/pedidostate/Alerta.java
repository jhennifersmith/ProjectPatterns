/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidostate;

/**
 *
 * @author 20211STADS024
 */
public class Alerta {
      private Status statusAtual;
    
    public Alerta(){
        this.statusAtual = new AguardandoPagamento();
    }

    public void setstatusAtual(Status novoStatus) {
        this.statusAtual = novoStatus;
    }
    
    public String notificar() {
       return this.statusAtual.notificar();
    }
}
