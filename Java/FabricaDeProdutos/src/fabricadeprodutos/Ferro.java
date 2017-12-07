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
public class Ferro extends Eletrodomestico{
    
    public Ferro(String marc, int prec, int volt) {
        super(marc, prec, volt);
    }
    public Ferro(String marc,  int volt) {
        super(marc, volt);
    }
    @Override public  double calcDesconto(int mes){
        if(mes == 5){
            this.preco *= 1.15;
            return this.preco;
        }return 0;
    }
    @Override public  boolean validaVolt(int volt){
        if(super.validaVolt(volt)|| volt == 5){
            return true;
        }
        return false;
    }
}
