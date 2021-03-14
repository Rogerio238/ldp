/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LdpGit;

import java.util.Date;

/**
 *
 * @author Utilizador
 */
public class Vendas {

    private int noVenda;
    private Date dataVenda;
    private float valor;
    private String tipo;
    /** Construtor da classe Vendas */
    public Vendas(int noVenda, String tipo){
        this.noVenda = noVenda;
        this.tipo = tipo;
    }

       /**
 *
 * metodo de acesso para ir buscar o numero de vendas
 */
    public int getNoVenda() {
        return noVenda;
    }
       /**
 *
 * metodo de acesso para ir buscar o tipo de artigo
 */
    public String getTipo() {
        return tipo;
    }

    
      /**
 *
 * metodo de acesso para ir buscar a data de venda
 */
    public Date getDataVenda() {
        return dataVenda;
    }
      /**
 *
 * metodo de acesso para definir a data de venda
 */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
      /**
 *
 * metodo de acesso para ir buscar o valor 
 */
    public float getValor() {
        return valor;
    }

          /**
 *
 * metodo de acesso para definir o valor 
 */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public static void main(String[] args) {
        VendaArtigos vA = new VendaArtigos(1,"Artigos");

        
    }
   
    
}
