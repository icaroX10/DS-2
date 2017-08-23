/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroportomain;

/**
 *
 * @author aluno
 */
public class Voo {
    protected Aviao aviao;
    protected Aeroporto origem;
    protected Aeroporto destino;
    
    public void setAviao(Aviao aviao){
        this.aviao = aviao;
    }
    
    public Aviao getAviao(){
        return this.aviao;
    }
    
    public void setOrigem(Aeroporto origem){
        this.origem = origem;
    }
    public Aeroporto getOrigem(){
        return this.origem;
    }
    
    public void setDestino(Aeroporto dest){
        this.destino = dest;
    }
    public Aeroporto getDestino(){
        return this.destino;
    }
    public Voo(Aviao av, Aeroporto ori,Aeroporto dest){
        this.setAviao(av);
        this.setOrigem(ori);
        this.setDestino(dest);
    }
}
