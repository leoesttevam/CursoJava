package application;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class teste {

	 public static void main(String args[]){ 
		    Calendar agora = Calendar.getInstance();
		    
		    // formata e exibe a data e hora atual
		    Format formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		    
		    System.out.println("Hoje �: " + formato.format(agora.getTime()));

		    // vamos adicionar 2 meses a esta data
		    agora.add(Calendar.MONTH, 1);

		    // formata e exibe o resultado
		    formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		    
		    System.out.println("Daqui a 2 meses ser�: " + formato.format(agora.getTime()));
		  } 
}
