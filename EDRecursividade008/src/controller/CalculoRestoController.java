/*
 * Exercício de recursividade, cálculo do resto de uma divisão
 * coletando dividendo e divisor.
 * versão 1.0
 * data 18/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class CalculoRestoController {
	public CalculoRestoController() {
		super();
	}
	public int restoDivisao(int A, int B) {
		// Condição para dividendo negativo
		// evita estouro de memória
		if (A < 0) {
			A = -A;
		}
		if (B < 0) {
			B = -B;
		}
		//Condição de parada
		// Quando dividendo(A), for menor que o divisor(B), retorna A como resto.
		if (A < B) {
			return A;
		}
		else {
			return restoDivisao(A - B, B);
		}
	}
}
