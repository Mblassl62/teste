package com.mblas.vetor.teste;

import com.mblas.vetor.Vetor;

public class aula2 {

	public static void main(String[] args) {
		
		Vetor vetor =new Vetor(10);		
	
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
	
		
		
		System.out.println(" = " + vetor.busca("elemento 3"));

	} 

}
