import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		int[] lista = new int[5];
		
		int i = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			int valor = entrada.nextInt();
			if(valor < 0)break;
			lista[i++] = valor;
		}
		
		for(int j=0;j<i;j++) {
			System.out.println(lista[j]);
		}
	}

}
