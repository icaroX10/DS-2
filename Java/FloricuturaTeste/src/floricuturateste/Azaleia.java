/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricuturateste;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Azaleia extends Plantas{
    
    
    public Azaleia(String esp, int cod,Vaso vas){
        this.setEspecificacoes(esp);
        this.setCodigo(cod);
        this.setValor(10);
        this.setDia();
        this.setVaso(vas);
    }
    
    @Override public ArrayList  regarPlanta(){
        if(this.getDia()%1==0 || this.getDia() == 1){
            this.setRegada("Dia "+this.getDia());
            return this.getRegada();
        }
        return this.getRegada();
    }
    
    @Override public ArrayList adubarPlanta(){
        if(this.getDia()%91==0 || this.getDia() == 1){
            this.setAduba("Dia "+this.getDia());
            return this.getAduba();
        }
        return this.getAduba();
    }    
}
