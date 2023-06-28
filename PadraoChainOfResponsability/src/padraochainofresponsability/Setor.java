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
public interface Setor {
    void tratarProblema(Solicitacao solicitacao);
    void setProximo(Setor proximo);
}
