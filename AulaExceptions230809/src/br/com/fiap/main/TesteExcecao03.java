/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.main;

public class TesteExcecao03 {

	public static void main(String[] args) {
		int[] numeros = {2,4,10,0,33};
		try {
			System.out.println("Exibindo exceção específica da classe ArrayIndex e passando por Finalally: \n\n");
			System.out.println(numeros[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//executa um bloco de codigo que executa sempre(mesmo se catch jogar uma exceção)
		}finally {
			System.out.println("Finalizou!\n");
		}
		System.out.println("\n\nFim de programa!");

	}

}
