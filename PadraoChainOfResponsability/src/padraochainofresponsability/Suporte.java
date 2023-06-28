/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraochainofresponsability;

/**
 *
 * @author 20211STADS024
 */
public class Suporte implements Setor {
    
    private Setor proximo;

    @Override
    public void tratarProblema(Solicitacao solicitacao) {
        if (solicitacao.getTipo() == TipoProblema.DEVOLUCAO){
            System.out.println("Setor de suporte tratou a requisição");
        }
        else {
            proximo.tratarProblema(solicitacao);
        }
    }

    @Override
    public void setProximo(Setor proximo) {
        this.proximo = proximo;
    }
    
}
