
public class Arrays {

	public static void main(String[] args) {
		
		Double[] temperaturas = new Double[5];
		
		temperaturas[0]= 23.4;
		temperaturas[1]= 33.4;
		temperaturas[2]= 43.4;
		temperaturas[3]= 53.4;
		temperaturas[4]= 63.4;
		
		System.out.println("valor temperatura dia 2 = " + temperaturas[2]);
		
		for(int i =0 ; i < temperaturas.length; i++) {
			System.out.println("temperaturas " + (i+1) + "=" + temperaturas[i]);
		}
		System.out.println("segundo for");
		
		for(double temp : temperaturas ) {
			System.out.println(temp);
		}
		
	}

}
