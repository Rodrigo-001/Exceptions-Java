/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.main;

import javax.swing.JOptionPane;

public class TesteExcecao7 {

	public static void main(String[] args) {
		String aux;
		int numero;		
		try {
			aux = JOptionPane.showInputDialog("Digite um n° inteiro entre 1 e 20: ");
			numero = Integer.parseInt(aux);
			if (numero>=1 &&numero<=20) {
				JOptionPane.showMessageDialog(null, "Numero: "+numero);				
			} else {
				//deve vir acompanhada de um "catch" ao final do código
				// gera uma exceção do tipo "Exception" com a mensagem "Valor fora da faixa permitida"
				throw new Exception("Valor fora da faixa permitida");
			}
			// Captura a exceção do tipo "NumberFormatException" e exibe a mensagem de erro na tela.			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			// classe exception é genérica - deve vir por ultimo
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		JOptionPane.showMessageDialog(null,"Fim!");

	}

}
