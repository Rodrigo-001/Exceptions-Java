/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.main;

public class TesteExcecao01 {

	public static void main(String[] args) {
		int[] numeros = { 2, 4, 10, 0, 33 };
		System.out.println("Exibindo exceção sem tratamento de erros: \n\n");
		System.out.println(numeros[5]);
		System.out.println("\n\nFim de programa!");

	}

}
