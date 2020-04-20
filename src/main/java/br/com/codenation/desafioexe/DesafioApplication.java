package br.com.codenation.desafioexe;

import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		return Fibonacci.sequencia();
	}
	
	public static Boolean isFibonacci(Integer a) {
		return Fibonacci.sequencia(a).contains(a);
	}

}