package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private static final int NUMERO_LIMITE_PADRAO = 350;

	public static List<Integer> sequencia() {
		return sequencia(NUMERO_LIMITE_PADRAO);
	}
	
	public static List<Integer> sequencia(int numeroLimite) {
		List<Integer> sequencia = new ArrayList<>();
		sequencia.add(retornarNumeroInicial());
		sequencia.add(retornarPrimeiraIteracao());
		while (sequencia.get(sequencia.size() -1 ) < numeroLimite) {
			Integer anterior = retornarPenultimoItem(sequencia);
			Integer ultimo = retornarUltimoItem(sequencia);
			sequencia.add(calcularProximo(anterior, ultimo));
		}
		return sequencia;
	}
	
	private static Integer retornarPenultimoItem(List<Integer> lista) {
		return lista.get(lista.size() -2);
	}
	
	private static Integer retornarUltimoItem(List<Integer> lista) {
		return lista.get(lista.size() -1);
	}
	
	private static Integer retornarNumeroInicial() {
		return 0;
	}
	
	private static Integer retornarPrimeiraIteracao() {
		return 1;
	}
	
	private static Integer calcularProximo(Integer anterior, Integer atual) {
		return anterior + atual;
	}
	
}
