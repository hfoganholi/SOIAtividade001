/*
 * Exercício de Sistemas Operacionais I
 * Meição do tempo de operação para valores pré-fixados..
 * versão 1.0
 * data 19/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class AfericaoTempoOperacaoController {
	public AfericaoTempoOperacaoController() {
		super();
	}
	public double cronometro(int tamanho) {
		// Cria vetor e preenche com zeros.
		int[] vetor = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = 0;
		}
		// Cria as variáveis que aferirão o tenpo da operação.
		long tempoInicial = System.nanoTime();
		// Cria o laço para percorrer o vetor.
		for (int i = 0; i < vetor.length; i++) {
			int valor = vetor[i];
		}
		long tempoFinal = System.nanoTime();
		long tempoAferido = tempoFinal - tempoInicial;
		double resultado = (double) tempoAferido / 1000000000.0; //nano = 10⁹
		return resultado;
	}
}
