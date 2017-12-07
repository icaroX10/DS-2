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
public class Tampa {
    protected String cor;
    protected String descricao;

    public void setCor(String cr){
            this.cor = cr;
    }
    public void setDescricao(String desc){
            this.descricao = desc;
    }
    public String getCor(){
            return cor;
    }
    public String getDescricao(){
            return descricao;
    }
    public Tampa(String cr,String desc){
            this.cor = cr;
            this.descricao = desc;
    }
}
