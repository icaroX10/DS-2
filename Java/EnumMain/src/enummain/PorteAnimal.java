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
public enum PorteAnimal {
    PEQUENO(1), MEDIO(2), GRANDE(3);
    
    private final int opcao;
    PorteAnimal(int valor){
        opcao = valor;
    }
    public int getOpcaoPA(){
        return opcao;
    }
}
