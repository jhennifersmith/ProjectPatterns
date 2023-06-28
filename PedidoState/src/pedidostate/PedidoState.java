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
public class PedidoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alerta alerta = new Alerta();
       alerta.notificar();
       alerta.setstatusAtual(new PagamentoConfirmado());
       
       TelaPedido tela = new TelaPedido();
       tela.setTxtItem("Chocolate");
       tela.setTxtNumPedido("112233");
       tela.setTxtQtd("2");
       tela.setTxtStatus(alerta.notificar());
       tela.setVisible(true);
       //setar status atual
       //criar uma nova tela de pedido
       //preencher todos os sets txt manualmente
       //tela.setTxtStatus(alerta.notificar());
       
    }
    
}
