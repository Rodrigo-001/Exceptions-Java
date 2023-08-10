/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.main;

public class TesteExcecao02 {

	public static void main(String[] args) {
		int[] numeros = {2,4,10,0,33};
		try {
			System.out.println("Tratando exceção da classeArrayIndex");
			System.out.println(numeros[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim de programa!");

	}

}
