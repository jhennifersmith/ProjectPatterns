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
public class Solicitacao {
    
    private TipoProblema tipo;

    public Solicitacao(TipoProblema tipo) {
        this.tipo = tipo;
    }

    public TipoProblema getTipo() {
        return tipo;
    }
    
}
