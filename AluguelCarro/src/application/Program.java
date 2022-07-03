package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrasilTaxaService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		try {
		System.out.println("Insira os dados de aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Data da saida e hora: ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Data de retorno e hora: ");
		Date finish = sdf.parse(sc.nextLine());

		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Insira o preço por hora : ");
		double priceHour = sc.nextDouble();
		System.out.print("Insira o preço por day: ");
		double priceDay = sc.nextDouble();
		
		RentalService rental = new RentalService(priceDay, priceHour, new BrasilTaxaService());
		
		rental.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + String.format("%.2f,", cr.getInvoice().getBasicPayment()));
		System.out.println("Taxa: " + String.format("%.2f,", cr.getInvoice().getTaxa()));
		System.out.println("Valor total: " + String.format("%.2f,", cr.getInvoice().getTotalPayment()));
		}
		catch(ParseException e) {
			System.out.println("Insira a data e hora (dd/MM/yyyy HH:ss)");
		}
		
		sc.close();
	}
}
