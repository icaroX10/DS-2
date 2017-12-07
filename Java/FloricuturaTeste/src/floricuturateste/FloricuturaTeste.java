/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricuturateste;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FloricuturaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Plantas> plantas = new ArrayList<Plantas>();
        boolean cond = true;
        String esp,vas,mat;
        int tO = 0,tA =0,tV = 0,dia,cod;
        while(cond){
            int op = Integer.parseInt( JOptionPane.showInputDialog("Digite\n1-Orquidea\n2-Azaleia\n3-Violeta"));
            switch(op){
                case 1:
                    ArrayList<String> rega = new ArrayList<String>();
                    ArrayList<String> aduba = new ArrayList<String>();
                    esp = JOptionPane.showInputDialog("Orquidea\nEspecificaçõe:");
                    cod = Integer.parseInt( JOptionPane.showInputDialog("Codigo:"));
                    vas = JOptionPane.showInputDialog("Tipo de vaso P/M/G:").toUpperCase();
                    mat = JOptionPane.showInputDialog("Materia do vaso barro/plastico:").toUpperCase();                

                    Vaso vs = new Vaso(vas,mat);
                    Plantas pl = new Orquidea(esp,cod,vs);
                    plantas.add(pl);
                    JOptionPane.showMessageDialog(null, "Dados da Planta\nTipo:Orquidea\nEspecificações:"+pl.getEspecificacoes()
                    +"\nCogigo:"+pl.getCodigo()+"\nDia da Planta:"+pl.getDia()+"\nTamanho Vaso:"+pl.getVaso().getTamanho()+"\nTamanho Vaso:"+pl.getVaso().getMaterial());
                    JOptionPane.showMessageDialog(null, "Valor a Pagar\nPreço da planta:"+pl.venderPlanta());
                    dia = Integer.parseInt( JOptionPane.showInputDialog("Simular quantos dias a planta tem:"));
                    for(int i = 0;i< dia;i++){
                        rega = pl.regarPlanta();
                        aduba = pl.adubarPlanta();
                        pl.setDia();
                    }
                    System.out.println("\nOrquidea\nDIAS QUE A PLANTA FOI REGADA");
                    for(int i = 0; i<rega.size();i++){
                        System.out.println(rega.get(i));
                    }
                    System.out.println("\nOrquidea\nDIAS QUE A PLANTA FOI ADUBADA");
                    for(int i = 0; i<aduba.size();i++){
                        System.out.println(aduba.get(i));
                    }
                    break;
                case 2:
                    ArrayList<String> regaA = new ArrayList<String>();
                    ArrayList<String> adubaA = new ArrayList<String>();
                    esp = JOptionPane.showInputDialog("Azaleia\nEspecificaçõe:");
                    cod = Integer.parseInt( JOptionPane.showInputDialog("Codigo:"));
                    vas = JOptionPane.showInputDialog("Tipo de vaso P/M/G:").toUpperCase();
                    mat = JOptionPane.showInputDialog("Materia do vaso barro/plastico:").toUpperCase();                

                    Vaso vs1 = new Vaso(vas,mat);
                    Plantas pl1 = new Azaleia(esp,cod,vs1);
                    plantas.add(pl1);
                    JOptionPane.showMessageDialog(null, "Dados da Planta\nTipo:Azaleia\nEspecificações:"+pl1.getEspecificacoes()
                    +"\nCogigo:"+pl1.getCodigo()+"\nDia da Planta:"+pl1.getDia()+"\nTamanho Vaso:"+pl1.getVaso().getTamanho()+"\nTamanho Vaso:"+pl1.getVaso().getMaterial());
                    JOptionPane.showMessageDialog(null, "Valor a Pagar\nPreço da planta:"+pl1.venderPlanta());
                    dia = Integer.parseInt( JOptionPane.showInputDialog("Simular quantos dias a planta tem:"));
                    for(int i = 0;i< dia;i++){
                        regaA = pl1.regarPlanta();
                        adubaA = pl1.adubarPlanta();
                        pl1.setDia();
                    }
                    System.out.println("\nAzaleia\nDIAS QUE A PLANTA FOI REGADA");
                    for(int i = 0; i<regaA.size();i++){
                        System.out.println(regaA.get(i));
                    }
                    System.out.println("\nAzaleia\nDIAS QUE A PLANTA FOI ADUBADA");
                    for(int i = 0; i<adubaA.size();i++){
                        System.out.println(adubaA.get(i));
                    }
                    break;
                case 3:
                    ArrayList<String> regaV = new ArrayList<String>();
                    ArrayList<String> adubaV = new ArrayList<String>();
                    esp = JOptionPane.showInputDialog("Violeta\nEspecificaçõe:");
                    cod = Integer.parseInt( JOptionPane.showInputDialog("Codigo:"));
                    vas = JOptionPane.showInputDialog("Tipo de vaso P/M/G:").toUpperCase();
                    mat = JOptionPane.showInputDialog("Materia do vaso barro/plastico:").toUpperCase();                

                    Vaso vs2 = new Vaso(vas,mat);
                    Plantas pl2 = new Violeta(esp,cod,vs2);
                    plantas.add(pl2);
                    JOptionPane.showMessageDialog(null, "Dados da Planta\nTipo:Violeta\nEspecificações:"+pl2.getEspecificacoes()
                    +"\nCogigo:"+pl2.getCodigo()+"\nDia da Planta:"+pl2.getDia()+"\nTamanho Vaso:"+pl2.getVaso().getTamanho()+"\nTamanho Vaso:"+pl2.getVaso().getMaterial());
                    JOptionPane.showMessageDialog(null, "Valor a Pagar\nPreço da planta:"+pl2.venderPlanta());
                    dia = Integer.parseInt( JOptionPane.showInputDialog("Simular quantos dias a planta tem:"));
                    for(int i = 0;i< dia;i++){
                        regaV = pl2.regarPlanta();
                        adubaV = pl2.adubarPlanta();
                        pl2.setDia();
                    }
                    System.out.println("\nVioleta\nDIAS QUE A PLANTA FOI REGADA");
                    for(int i = 0; i<regaV.size();i++){
                        System.out.println(regaV.get(i));
                    }
                    System.out.println("\nVioleta\nDIAS QUE A PLANTA FOI ADUBADA");
                    for(int i = 0; i<adubaV.size();i++){
                        System.out.println(adubaV.get(i));
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
            int opc = JOptionPane.showConfirmDialog(null, "Deseja inserir Mais alguma planta?");
            if(opc == 0){
                cond = true;
            }else if(opc == 1){
                cond = false;
            }
        }
        for(int i= 0; i < plantas.size();i++){
            if(plantas.get(i) instanceof Orquidea){
                tO++;
            }else if(plantas.get(i) instanceof Azaleia){
                tA++;
            }else if(plantas.get(i) instanceof Violeta){
                tV++;
            }
        }
        JOptionPane.showMessageDialog(null, "Foram cadastradas\nOrquidea:"+tO+"\nAzaleia:"+tA+"\nVioleta:"+tV);
    }
}
