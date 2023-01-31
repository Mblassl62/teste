import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		Calendar data = Calendar.getInstance();
		data.add(Calendar.DAY_OF_WEEK, 0);
		
		Date data3 = data.getTime();
		System.out.println(data3);
		
		
		
		System.out.println("Entre com uma Data:");
		String data1 = sc.nextLine();
		
		System.out.println("Entre com segunda Data:");
		String data2 = sc.nextLine();

		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");//"dd/MM/yyyy HH:mm:ss"
		Date date1 = format.parse(data1);
		Date date2 = format.parse(data2);
		
		if (date1.equals(date2)) {
			System.out.println("Sao iguais");
		}else {
			System.out.println("Sao diferente");
		}
		
		/*try {
			data = format.parse(dataentrada);
			System.out.println(format.format(data));
		} catch (ParseException e) {
			System.out.println("Formato invalido   " + dataentrada);
			//e.printStackTrace();
		}*/
		
		
		
	}

}
