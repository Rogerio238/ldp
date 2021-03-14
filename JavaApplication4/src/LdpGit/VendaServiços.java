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
public class VendaServiços extends Vendas{
    private List<Servicos> listaServicos;

    /**
     *
     * @param noVenda
     * @param tipo
     */
    public VendaServiços(int noVenda, String tipo) {
        super(noVenda, tipo);
        
        listaServicos = new ArrayList<Servicos>();
    }
       /**
 *
 * metodo de acesso para ir buscar a lista de serviços
     * @return 
 */
    public List getListaServicos(){
        return listaServicos;
    }
    
    
    
}
