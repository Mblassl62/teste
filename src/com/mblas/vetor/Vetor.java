package com.mblas.vetor;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adiciona(String elemento) throws Exception {
		/*for(int i=0; 1 < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}*/
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho]=elemento;
			this.tamanho++;
		}else {
			throw new Exception("Vetor ja esta cheio");
		}
		
	}

}
