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
public class Aviao {
    private String prefixo;
    private String nome;
    private String fabricante;
    private int qtAssento;
    private int qtAssOcupado;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQtAssento() {
        return qtAssento;
    }

    public void setQtAssento(int qtAssento) {
        this.qtAssento = qtAssento;
    }

    public int getQtAssOcupado() {
        return qtAssOcupado;
    }

    public void setQtAssOcupado(int qtAssOcupado) {
        this.qtAssOcupado = qtAssOcupado;
    }
    
    public Aviao(String prefixo,String nome,String fabricante){
        this.prefixo = prefixo;
        this.nome = nome;
        this.fabricante = fabricante;
    }
    
    
}
