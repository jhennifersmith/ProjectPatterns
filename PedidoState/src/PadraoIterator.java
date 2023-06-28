
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20211STADS024
 */
public class PadraoIterator {
 
    public static void main (String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Aquila");
        nomes.add("Maria");
        nomes.add("Jhennifer");
        
        Iterator<String> iterador = nomes.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }
        
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Aquila", 10);
        notas.put("Maria", 10);
        notas.put("Jhennifer", 10);
        
        Iterator<Map.Entry<String, Integer>> iterador2 = notas.entrySet().iterator();
        while(iterador2.hasNext()){
            Map.Entry<String, Integer> entrada = iterador2.next();
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
        
    }
    
}
