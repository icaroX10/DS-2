/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricuturateste;

/**
 *
 * @author aluno
 */
public class Vaso {
    private String tamanho;
    private String material;
    private double valor;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho.toUpperCase();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material.toUpperCase();
    }

    public double getValor() {
        return valor;
    }
    /*
    public void setValor(double valor) {
        this.valor = valor;
    }
    */
    public void setValor(){
        if((this.getTamanho().equalsIgnoreCase("P") || this.getTamanho().equalsIgnoreCase("M"))
                && this.getMaterial().equalsIgnoreCase("PLASTICO")){
            this.valor = 4;
        }else if((this.getTamanho().equalsIgnoreCase("P") || this.getTamanho().equalsIgnoreCase("M"))
                && this.getMaterial().equalsIgnoreCase("BARRO")){
            this.valor = 8;
        }else if(this.getTamanho().equalsIgnoreCase("G") && this.getMaterial().equalsIgnoreCase("PLASTICO")){
            this.valor = 6;
        }else if(this.getTamanho().equalsIgnoreCase("G") && this.getMaterial().equalsIgnoreCase("BARRO")){
            this.valor = 10;
        }
    }
    
    public Vaso(String tam,String mat){
        this.setTamanho(tam);
        this.setMaterial(mat);
        this.setValor();
    }
    
}
