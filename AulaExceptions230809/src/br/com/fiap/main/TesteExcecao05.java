/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
package br.com.fiap.main;

public class TesteExcecao05 {

	public static void main(String[] args) {
		int[] numeros = {2,4,10,25,33,45};
		int[] divisores = {2,2,0,5};
		
		//laço percorre tamanho do array numeros e imprime e divisão dos elementos de índice i dos arrays numeros e divisores.
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println("Resultado: "+(numeros[i]/divisores[i]));
			//exceção para erros da classe ArithmeticException
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			//	exceção para erros da classe ArrayIndexOutOfBoundsException
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				
			//sempre executará, mesmo se catch jogar um exceção
			}finally {
				System.out.println("Finalizou!\n");
			}
		}
		System.out.println("Fim de programa!");

	}

}
