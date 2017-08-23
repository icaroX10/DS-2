/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroportomain;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Aeroporto {
    protected String codigo;
    protected String nome;
    protected boolean internacional;
    ArrayList<Voo> direcaoVoo = new ArrayList<Voo>();
    ArrayList<Voo> vindoVoo = new ArrayList<Voo>();
    /*
    ArrayList<Aeroporto> voosDir = new ArrayList<Aeroporto>();
    ArrayList<Aeroporto> voosVindo = new ArrayList<Aeroporto>();
    */
    ArrayList<Aviao> avioesPat = new ArrayList<Aviao>();
    
    
    public void setCodigo(String cod){
        this.codigo = cod;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setInternacional(boolean inter){
        this.internacional = inter;
    }
    public boolean getInternacional(){
        return this.internacional;
    }
    
    public void setVoosDir(Voo voosD){
        this.direcaoVoo.add(voosD);
    }
    public ArrayList getVoosDir(){
        return this.direcaoVoo;
    }
    
    public void setVoosVindo(Voo voosV){
        this.vindoVoo.add(voosV);
    }
    public ArrayList getVoosVindo(){
        return this.vindoVoo;
    }
    
    public void setAviaoPat(Aviao aviaoP){
        this.avioesPat.add(aviaoP);
    }
    public ArrayList getAviaoPat(){
        return this.avioesPat;
    }
    
    public Aeroporto(String codigo,String nome,boolean inter){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setInternacional(inter);
    }
    
    public boolean difAeroporto(Aeroporto aero){
        return this.codigo.equalsIgnoreCase(aero.getCodigo());
    }
    
    public boolean verificaPatio(Aviao aviao){
        for(int i =0; i < avioesPat.size(); i++){
            if(this.avioesPat.get(i).getPrefixo().equalsIgnoreCase(aviao.getPrefixo())){
                return true;
            }
        }
        return false;
    }
    
    public boolean possuiRota(Aeroporto aero){
        for(int i =0; i < direcaoVoo.size(); i++){
            if(aero.getCodigo().equalsIgnoreCase( this.direcaoVoo.get(i).getDestino().getCodigo() )){
                return true;
            }
        }
        return false;
    }
}
