/*
 * Exercício de recursividade, cálculo do resto de uma divisão
 * coletando dividendo e divisor.
 * versão 1.0
 * data 18/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.CalculoRestoController;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		CalculoRestoController controle = new CalculoRestoController();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite valor para o dividendo: ");
		int dividendo = sc.nextInt();
		System.out.print("Digite valor para o divisor: ");
		int divisor = sc.nextInt();
		if (divisor == 0) {
			System.out.println("Não utilize zero no divisor!!!");
		}
		int resultado = controle.restoDivisao(dividendo, divisor);
		System.out.println("O resto da divisão é " + resultado);
		sc.close();
	}
}
