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
public class Comum extends Racao{
    @Override public double desconto(double preco){
        return super.kgPeso(this.getPeso());
    }
}
