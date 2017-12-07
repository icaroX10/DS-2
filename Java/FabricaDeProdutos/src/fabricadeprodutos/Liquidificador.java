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
public class Liquidificador extends Eletrodomestico implements MediaLitro{
    protected Tampa tamp;
    public void setTampa(Tampa tam){
        this.tamp = tam;
    }
    public Liquidificador(String marc, int prec, int volt,Tampa tam) {
        super(marc, prec,volt);
        this.tamp = tam;
    }
    public Liquidificador(String marc,  int volt,Tampa tam) {
        super(marc, volt);
        this.tamp = tam;
    }
    
    
    @Override public int calcQuantMedia(int quantidade,int capacidade){
        return quantidade/capacidade;
    }  
    
    
    @Override public  double calcDesconto(int mes){
        if(mes == 12){
            this.preco *= 1.2;
            return this.preco;
        }return 0;
    }
    
    
}
