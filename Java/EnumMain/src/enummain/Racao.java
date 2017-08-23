/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enummain;

/**
 *
 * @author aluno
 */
abstract public class Racao {
    protected double preco;
    protected double peso;
    
    public void setPreco(double prec){
        this.preco = prec;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public void setPeso(double pes){
        this.peso = pes;
    }
    public double getPeso(){
        return this.peso;
    }
    
    public Racao(){
        
    }
    
    public double kgPeso(double pes){
        if(pes >= 0.1 && pes <= 3){
            return this.preco;
        }else if(pes >=4 && pes <= 10 ){
            return this.preco*1.15;
        }else if(pes >=11 && pes <= 50 ){
            return this.preco*1.20;
        }else {
            return this.preco*1.30;
        }
    }
    
    abstract public double desconto(double preco);
}
