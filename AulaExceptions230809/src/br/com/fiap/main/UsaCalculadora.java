/*Programa para praticar tratamento de erros - Tipos de Exceptions*/
/*Essa calculadora simples pede dois números e a operação desejada, usa laço para sempre retornar ao inicio caso ou encerrar, conforme a escolha do usuário*/
package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Calculadora;

public class UsaCalculadora {

	public static void main(String[] args) {		
		Calculadora calc1 = new Calculadora();
		//declaração de variáveis
		float num1,num2;
		int op;
		String aux, continuar="sim", resultado;		
				
		//laço principal
		while (continuar.equalsIgnoreCase("sim")) {
			try {
				//recebe numeros
				aux = JOptionPane.showInputDialog("*--Calculadora Simples--*\n\nDigite um número real: ");
				num1 = Float.parseFloat(aux);
				calc1.setNumero1(num1);
				aux = JOptionPane.showInputDialog("Digite mais um número real: ");
				num2 =  Float.parseFloat(aux);
				calc1.setNumero2(num2);		
				//recebe operação
				aux = JOptionPane.showInputDialog(null, "Escolha a operação: \n\n"
						+ "(1)Soma\n(2)Subtração\n(3)Multiplicação\n(4)Divisão");
				op = Integer.parseInt(aux);
				
				//condicional para calcular resultado
				switch (op) {
				case 1:
					//JOptionPane.showMessageDialog(null, "Você escolheu soma: "+num1+ " e " +num2);
					resultado = "Você escolheu soma: "+num1+ " e " +num2+
							"\nResultado: "+calc1.adicao();
					JOptionPane.showMessageDialog(null, resultado);					
					break;
				case 2:
					//JOptionPane.showMessageDialog(null, "Você escolheu subtração: "+num1+ " e " +num2);
					resultado = "Você escolheu subtração: "+num1+ " e " +num2+
							"\nResultado: "+calc1.subtracao();		
					JOptionPane.showMessageDialog(null, resultado);					
					break;
				case 3:
					//JOptionPane.showMessageDialog(null, "Você escolheu multiplicação: "+num1+ " e " +num2);
					resultado = "Você escolheu multiplicação: "+num1+ " e " +num2+
							"\nResultado: "+calc1.multiplicacao();	
					JOptionPane.showMessageDialog(null, resultado);					
					break;
				case 4:
					//JOptionPane.showMessageDialog(null, "Você escolheu divisão: "+num1+ " e " +num2);
					resultado = "Você escolheu divisão: "+num1+ " e " +num2+
							"\nResultado: "+calc1.divisao();	
					JOptionPane.showMessageDialog(null, resultado);					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}						
				//retoma ou encerra laço
				continuar = JOptionPane.showInputDialog("Continuar? ");				
			} catch (Exception e) {
				System.out.println(e.getMessage());								
			 }
		}
			JOptionPane.showMessageDialog(null, "Fim da execução!");
}
}

