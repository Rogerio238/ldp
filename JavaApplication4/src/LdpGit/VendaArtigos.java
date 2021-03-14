/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LdpGit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utilizador
 */
public class VendaArtigos extends Vendas {
    
    private List<Artigo> listaArtigos;

    /**
     *
     * @param noVenda
     * @param tipo
     */
    public VendaArtigos(int noVenda, String tipo) {
        super(noVenda,tipo);
        listaArtigos = new ArrayList<Artigo>();
    }
    /**
 *
 * @return metodo de acesso para ir buscar a lista de artigo
 */
    public List getListaArtigos(){
        return listaArtigos;
    }
/**
 *
 * @return metodo que conta o numero de artigos vendidos
 */
    public int contaVendaArtigo(){
        int countArtigo = 0;
        for(Artigo a : listaArtigos){
            countArtigo++;
        }
        
        return countArtigo;
    }
    
    
    
}
