package com.mblas.vetor.teste;

import com.mblas.vetor.Vetor;

public class aula7 {

	public static void main(String[] args) {
		
		Vetor vetor= new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("c");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.adciona(0, "A");
		
		System.out.println(vetor);
		
        vetor.adciona(5, "F");
		
		System.out.println(vetor);
	}

}
