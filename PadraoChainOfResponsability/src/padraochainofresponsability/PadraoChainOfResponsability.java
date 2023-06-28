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
public class PadraoChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Solicitacao s1 = new Solicitacao(TipoProblema.EMISSAO_NOTA);
        Solicitacao s2 = new Solicitacao(TipoProblema.DEVOLUCAO);
        Solicitacao s3 = new Solicitacao(TipoProblema.NOVO_PEDIDO);
        Solicitacao s4 = new Solicitacao(TipoProblema.OUTRO);
        
        Setor suporte = new Suporte();
        Setor financeiro = new Financeiro();
        Setor venda = new Venda();
        Setor outro = new Outro();
        
        suporte.setProximo(financeiro);
        financeiro.setProximo(venda);
        venda.setProximo(outro);
        
        suporte.tratarProblema(s1);
        suporte.tratarProblema(s2);
        suporte.tratarProblema(s3);
        suporte.tratarProblema(s4);
        
               
    }
    
}
