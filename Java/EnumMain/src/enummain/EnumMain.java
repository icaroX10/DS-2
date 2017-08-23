/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enummain;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */

public class EnumMain {

    /**
     * @param args the command line arguments
     */
    
    public static void menu(){
        String opR;
        double kg,preco;
        opR =  JOptionPane.showInputDialog("Ração\n1-Comum\n2-Premium\n3-SuperPremium");
        opR.toUpperCase();

        if(opR.equalsIgnoreCase("COMUM")){
                preco = Double.parseDouble(JOptionPane.showInputDialog("Infome o preço da Ração:"));
                kg = Double.parseDouble(JOptionPane.showInputDialog("Infome quantos Kg vc deseja:"));
                Comum cm = new Comum();
                cm.setPreco(preco);
                cm.setPeso(kg);
                cm.kgPeso();
                JOptionPane.showMessageDialog(null, "O preço da Ração Comum é "+cm.desconto());
                
        }else if(opR.equalsIgnoreCase("PREMIUM")){
            preco = Double.parseDouble(JOptionPane.showInputDialog("Infome o preço da Ração:"));
            kg = Double.parseDouble(JOptionPane.showInputDialog("Infome quantos Kg vc deseja:"));
            Premium pr = new Premium();
            pr.setPreco(preco);
            pr.setPeso(kg);
            pr.kgPeso();
            JOptionPane.showMessageDialog(null, "O preço da Ração Premium é "+pr.desconto());
        }else if(opR.equalsIgnoreCase("SUPERPREMIUM")){
            preco = Double.parseDouble(JOptionPane.showInputDialog("Infome o preço da Ração:"));
            kg = Double.parseDouble(JOptionPane.showInputDialog("Infome quantos Kg vc deseja:"));
            SuperPremium pr = new SuperPremium();
            pr.setPreco(preco);
            pr.setPeso(kg);
            pr.kgPeso();
            JOptionPane.showMessageDialog(null, "O preço da Ração SuperPremium é "+pr.desconto());
        }else{
            JOptionPane.showMessageDialog(null, "Opção invalida!");
        }              
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String op =  JOptionPane.showInputDialog("Porte Animal\n1-Porte Pequeno\n2-Porte Medio\n3-Porte Grande");
        
        PorteAnimal ptPeq = PorteAnimal.PEQUENO;
        PorteAnimal ptMed = PorteAnimal.MEDIO;
        PorteAnimal ptGra = PorteAnimal.GRANDE;
        op.toUpperCase();
        
        if(op.equalsIgnoreCase(ptPeq.name())){
            menu();
        }else if(op.equalsIgnoreCase(ptMed.name())){
            menu();
        }else if(op.equalsIgnoreCase(ptGra.name())){
            menu();
        }else{
            JOptionPane.showMessageDialog(null, "Opção invalida");
        }
    }
    
}
