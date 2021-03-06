package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dates = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		date.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Instanciar com a data atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date d1 = data.parse("21/06/2022");
		Date d2 = dates.parse("21/06/2022 13:54:08");
		Date d3 = Date.from(Instant.parse("2022-06-21T14:07:07Z"));
		
		System.out.println("D1 " + d1);
		System.out.println("D2 " + d2);
		System.out.println("D3 " + d3);
		System.out.println("X1 " + x1);
		System.out.println("X2 " + x2);
		System.out.println("X3 " + x3);
		System.out.println("X4 " + x4);
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("D1 " + dates.format(d1));
		System.out.println("D2 " + dates.format(d2));
		System.out.println("D3 " + dates.format(d3));
		System.out.println("X1 " + dates.format(x1));
		System.out.println("X2 " + dates.format(x2));
		System.out.println("X3 " + dates.format(x3));
		System.out.println("X4 " + dates.format(x4));
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("D1 " + date.format(d1));
		System.out.println("D2 " + date.format(d2));
		System.out.println("D3 " + date.format(d3));
		System.out.println("X1 " + date.format(x1));
		System.out.println("X2 " + date.format(x2));
		System.out.println("X3 " + date.format(x3));
		System.out.println("X4 " + date.format(x4));
	}
}
