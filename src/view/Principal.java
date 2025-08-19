/*
 * Exercício de Sistemas Operacionais I
 * Meição do tempo de operação para valores pré-fixados..
 * versão 1.0
 * data 19/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.AfericaoTempoOperacaoController;

public class Principal {
	public static void main(String[] args) {
		AfericaoTempoOperacaoController controle = new AfericaoTempoOperacaoController();
		int tamanho1 = 1000;
		int tamanho2 = 10000;
		int tamanho3 = 100000;
		double tempo1 = controle.cronometro(tamanho1);
		System.out.println("Tempo de operação para vetor de tamanho " +tamanho1+ " : " + tempo1 + " segundos.");
		double tempo2 = controle.cronometro(tamanho2);
		System.out.println("Tempo de operação para vetor de tamanho " +tamanho2+ " : " + tempo2 + " segundos.");
		double tempo3 = controle.cronometro(tamanho3);
		System.out.println("Tempo de operação para vetor de tamanho " +tamanho3+ " : " + tempo3 + " segundos.");
	}
}
