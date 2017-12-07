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
abstract public class Plantas {
    private String especificacoes;
    private int codigo;
    protected int dia = 0;
    protected double valor;
    protected Vaso vaso;    
    protected ArrayList<String> regar = new ArrayList<String>();
    protected ArrayList<String> adubo = new ArrayList<String>();

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setDia(){
        this.dia++;
    }
    public int getDia(){
        return this.dia;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    
    public void setVaso(Vaso vaso){
        this.vaso = vaso;
    }
    public Vaso getVaso(){
        return this.vaso;
    }
    
    public void setRegada(String rega){
        this.regar.add(rega);
    }
    public ArrayList getRegada(){
        return this.regar;
    }
    
    public void setAduba(String aduba){
        this.adubo.add(aduba);
    }
    public ArrayList getAduba(){
        return this.adubo;
    }
    
    abstract public ArrayList  regarPlanta();
    
    abstract public ArrayList adubarPlanta();
    
    public double venderPlanta(){
        double saldo;
        saldo = this.getValor() + this.getVaso().getValor();
        return saldo;        
    }
}
