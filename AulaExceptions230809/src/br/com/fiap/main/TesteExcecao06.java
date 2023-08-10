/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.main;

import javax.swing.JOptionPane;

public class TesteExcecao06 {

	public static void main(String[] args) {
		String aux;
		int numero;
		
		//Neste exemplo há um erro que não será registrado por nenhuma exception, pois se trata de uma regra de negócio
		//O outro erro que pode acontecer será registrado pela Exception de classe  java.lang.NumberFormatException (digitou caractere não numerico)
		aux = JOptionPane.showInputDialog("Digite um n° inteiro entre 1 e 20: ");
		numero = Integer.parseInt(aux);
		JOptionPane.showMessageDialog(null, "Numero: "+numero);

	}

}
