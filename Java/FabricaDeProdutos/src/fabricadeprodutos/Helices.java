/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadeprodutos;

/**
 *
 * @author Aluno
 */
public class Helices {
    protected int quantidade;

    public void setQuantidade(int quant){
            this.quantidade = quant;
    }
    public int getQuantidade(){
            return quantidade;
    }
    public Helices(int quant){
            this.quantidade = quant;
    }
}
