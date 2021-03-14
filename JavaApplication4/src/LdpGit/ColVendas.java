/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LdpGit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Utilizador
 */
public class ColVendas {
    
    private List<Vendas> listaDeVendas;
    
    /**
     *
     */
    public ColVendas(){
        listaDeVendas = new ArrayList<Vendas>();
    }
    
    /**
     *
     * @param v
     */
    public void addVenda(Vendas v){
        for(Vendas i : listaDeVendas){
            if(v.getNoVenda() != i.getNoVenda()){
                listaDeVendas.add(v);
            }else{
                System.out.println("Venda já existe!");
            }
        }
    }
    
    /**
     *
     * @param dataVenda
     * @return retorna o número de vendas
     */
    public int noVendas(Date dataVenda){
        int countVendas = 0;
        for(Vendas i : listaDeVendas){
            if(i.getDataVenda() == dataVenda){
               countVendas++; 
            }
        }
        
        return countVendas;
    }
    
    /**
     *
     * @return retorna a quantigade de Artigos Vendidos
     */
    public int devolveQtdArtigosVendidos(){
            int countArtigos = 0;
        for(Vendas v : listaDeVendas){
            if(v.getTipo() == "Artigos"){
                countArtigos++;
            }
        }
        return countArtigos;
            
    }
    
    
}
