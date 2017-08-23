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
public class AeroportoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // AVião
        Aviao a1 = new Aviao("A01","Boing001","Tam");
        Aviao a2 = new Aviao("A02","Boing002","Tap");
        Aviao a3 = new Aviao("A03","Boing003","Tam");
        Aviao a4 = new Aviao("A04","Boing004","Tap");
        Aviao a5 = new Aviao("A05","Boing005","Tam");
        Aviao a6 = new Aviao("A06","Boing006","Tap");
        // Aeroporto
        Aeroporto ar1 = new Aeroporto("SSA","Salvador",true);
        Aeroporto ar2 = new Aeroporto("BRB","Brasilia",false);
        Aeroporto ar3 = new Aeroporto("FTL","Fortaleza",true);
        Aeroporto ar4 = new Aeroporto("MAN","Manaus",false);
        Aeroporto ar5 = new Aeroporto("RIO","Rio de Janeiro",false);
        Aeroporto ar6 = new Aeroporto("SSP","São Paulo",false);
        // Voos
        Voo v1 = new Voo(a1,ar1,ar2);
        Voo v2 = new Voo(a2,ar2,ar3);
        Voo v3 = new Voo(a3,ar3,ar4);
        Voo v4 = new Voo(a4,ar3,ar2);
        Voo v5 = new Voo(a5,ar2,ar3);
        Voo v6 = new Voo(a6,ar1,ar3);
        // Lista de Voos
        ar1.setVoosDir(v1);
        ar1.setVoosDir(v2);
        ar1.setVoosDir(v3);
        
        ar2.setVoosDir(v1);
        ar2.setVoosDir(v2);
        ar2.setVoosDir(v3);
        
        ar1.setVoosVindo(v4);
        ar1.setVoosVindo(v5);
        ar1.setVoosVindo(v6);
        
        ar1.setVoosVindo(v4);
        ar1.setVoosVindo(v5);
        ar1.setVoosVindo(v6);
        //Aviao Patio
        ar1.setAviaoPat(a1);
        ar1.setAviaoPat(a2);
        ar1.setAviaoPat(a3);
        
        ar2.setAviaoPat(a6);
        ar2.setAviaoPat(a5);
        ar2.setAviaoPat(a4);
        
        //Diferenciar avião no patio
        if(ar1.difAeroporto(ar2)){
            System.out.println(ar1.getCodigo()+" é igual a "+ar2.getCodigo());
        }else{
            System.out.println("Não são iguais ");
        }
        if(ar1.difAeroporto(ar1)){
            System.out.println(ar1.getCodigo()+" é igual a "+ar1.getCodigo());
        }else{
            System.out.println("Não são iguais ");
        }
        //Aviao no patio
        if(ar1.verificaPatio(a1)){
            System.out.println("Aviao no patio");
        }else{
            System.out.println("Aviao não esta no patio");
        }
        
        if(ar2.verificaPatio(a2)){
            System.out.println("Aviao no patio");
        }else{
            System.out.println("Aviao não esta no patio");
        }
        //Possui Rota
        if(ar1.possuiRota(ar2)){
            System.out.println("Possui rota");
        }else{
            System.out.println("Não possui rota");
        }
        if(ar2.possuiRota(ar3)){
            System.out.println("Possui rota");
        }else{
            System.out.println("Não possui rota");
        }
        if(ar3.possuiRota(ar1)){
            System.out.println("Possui rota");
        }else{
            System.out.println("Não possui rota");
        }
        
    }
    
}
