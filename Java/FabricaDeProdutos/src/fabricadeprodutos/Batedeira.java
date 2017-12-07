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
public class Batedeira extends Eletrodomestico implements MediaLitro{
    protected Helices helice;
    
    public void setHelice(Helices hel){
        this.helice = hel;
    }
    
    public Batedeira(String marc, int prec, int volt, Helices hel) {
        super(marc, prec,volt);
        this.helice = hel;
    }
    public Batedeira(String marc,  int volt, Helices hel) {
        super(marc, volt);
        this.helice = hel;
    }
    
    @Override public int calcQuantMedia(int quantidade,int capacidade){
        if(this.helice.quantidade > 1){
            return quantidade*capacidade;
        }
        return quantidade/capacidade;
    }  
    
    @Override public  double calcDesconto(int mes){
        if(mes == 8){
            this.preco *= 1.1;
            return this.preco;
        }return 0;
    }
    
}
