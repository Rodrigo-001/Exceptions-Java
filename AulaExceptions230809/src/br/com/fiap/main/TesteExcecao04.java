/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.main;

public class TesteExcecao04 {

	public static void main(String[] args) {
		int[] numeros = {2,4,10,0,33,45};
		int[] divisores = {2,2,0,5};
		System.out.println("Exemplo de exeção da classe ArithmeticException sem tratamento'''\n\n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Resultado: "+(numeros[i]/divisores[i]));
		}
		System.out.println("Fim de programa!");

	}

}
