/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadeprodutos;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FabricaDeProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op = Integer.parseInt( JOptionPane.showInputDialog("Digite 1 Para cadastrar Liquidificador\nDigite 2 Para cadastrar Batedeira\nDigite 3 Para cadastrar Ferro:"));
        switch(op){
            case 1:
                Tampa tamp = new Tampa("Preto", "Parece o Batman");
                Liquidificador liq = new Liquidificador("DC", 25, 110, tamp);
                Liquidificador liq1 = new Liquidificador("DC", 25, 115, tamp);
                JOptionPane.showMessageDialog(null, "Liquidificador:\nMarca:"+liq.getMarca()+"\nPreço:"+liq.getPreco()+"\nVoltagem:"+liq.getVoltagem()+"\n\tTampa:\n\tCor:"+liq.tamp.getCor()+"\n\tDescrição:"+liq.tamp.getDescricao()+"\nCom Desconto:"+liq1.calcDesconto(8)+"\nMedia por litro:"+liq1.calcQuantMedia(20, 10));
                JOptionPane.showMessageDialog(null, "Liquidificador:\nMarca:"+liq1.getMarca()+"\nPreço:"+liq1.getPreco()+"\nVoltagem:"+liq1.getVoltagem()+"\n\tTampa:\n\tCor:"+liq1.tamp.getCor()+"\n\tDescrição:"+liq1.tamp.getDescricao()+"\nCom Desconto:"+liq1.calcDesconto(8)+"\nMedia por litro:"+liq1.calcQuantMedia(20, 10));
                break;
            case 2:
                Helices hel = new Helices(1);
                Helices hela = new Helices(5);
                Batedeira bat = new Batedeira("Marvel",40, 220, hel);
                Batedeira batM = new Batedeira("Marvel",40, 221, hela);
                JOptionPane.showMessageDialog(null, "Batedeira:\nMarca:"+bat.getMarca()+"\nPreço:"+bat.getPreco()+"\nVoltagem:"+bat.getVoltagem()+"\n\tHelice:\n\tQuantidade:"+bat.helice.getQuantidade()+"\nCom Desconto:"+bat.calcDesconto(8)+"\nMedia por litro:"+bat.calcQuantMedia(20, 10));
                JOptionPane.showMessageDialog(null, "Batedeira:\nMarca:"+batM.getMarca()+"\nPreço:"+batM.getPreco()+"\nVoltagem:"+batM.getVoltagem()+"\n\tHelice:\n\tQuantidade:"+batM.helice.getQuantidade()+batM.calcDesconto(8)+"\nMedia por litro:"+batM.calcQuantMedia(20, 10));
                break;
            case 3:
                Ferro fer = new Ferro("WArner",40, 5);
                Ferro ferr = new Ferro("Fox",40, 10);
                JOptionPane.showMessageDialog(null, "Ferro:\nMarca:"+fer.getMarca()+"\nPreço:"+fer.getPreco()+"\nVoltagem:"+fer.getVoltagem()+"\n\t");
                JOptionPane.showMessageDialog(null, "Ferro:\nMarca:"+ferr.getMarca()+"\nPreço:"+ferr.getPreco()+"\nVoltagem:"+ferr.getVoltagem()+"\n\t");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite uma opção valida...");
                break;
        }
    }
    
}
