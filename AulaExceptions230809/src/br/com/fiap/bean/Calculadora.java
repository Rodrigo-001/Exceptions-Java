/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Calculadora {
	private float numero1, numero2;
	
	//construtor vazio
	public Calculadora() {		
	}

	//gets e sets	
	public float getNumero1() {
		return numero1;
	}

	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}

	public float getNumero2() {
		return numero2;
	}

	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}

	//métodos
	public float adicao() {				
		return this.numero1+this.numero2;
	};
	public float subtracao() {		
		return this.numero1-this.numero2;
	};
	public float multiplicacao() {		
		return this.numero1*this.numero2;
	}
	public float divisao() {
		if (numero2==0 ) {
			//personaliza uma mensagem de erro para a classe ArithmeticException
			throw new ArithmeticException("Não é possível dividor por zero");
		} else {					
			return this.numero1/this.numero2;
		}
	}
	
}
