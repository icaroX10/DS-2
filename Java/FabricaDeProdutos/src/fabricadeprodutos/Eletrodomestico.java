/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadeprodutos;



/**
 *
 * @author Aluno
 */
public abstract class Eletrodomestico {
    protected String marca;
	protected double preco;
	protected int voltagem;

	public void setMarca(String marc){
		this.marca = marc;
	}

	public void setPreco(double prec){
		this.preco = prec;
	}
	public String getMarca(){
		return marca;
	}

	public double getPreco(){
		return preco;
	}

        public boolean validaVolt(int volt){
            return volt == 110 || volt == 220;
        }
        public  boolean setVoltagem(int volt){
            if(validaVolt(volt)){
                this.voltagem = volt;
                return true;
            }
            return false;
        }
        
	public int getVoltagem(){
		return voltagem;
	}
        
	public Eletrodomestico(String marc,int prec,int volt){
		this.marca = marc;
		this.preco = prec;
		this.setVoltagem(volt);
	}
        
        public Eletrodomestico(String marc,int volt){
		this.marca = marc;
		this.setVoltagem(volt);
	}
        
	public abstract double calcDesconto(int mes);
}
