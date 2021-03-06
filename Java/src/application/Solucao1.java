package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Resevation;

public class Solucao1 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number");
		int num = sc.nextInt();
		System.out.println("Check-in date: ");
		Date check = sdf.parse(sc.next());
		System.out.println("Check-in date: ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(check)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date: ");
		}else {
			Resevation res = new Resevation(num, check, checkOut);
			System.out.println("Resevation: " + res);
			
			System.out.println();
			System.out.println("Enter data to update he reservation: ");
			System.out.println("Room number");
			num = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			check = sdf.parse(sc.next());
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
				String error = res.upDates(check, checkOut);
				if(error != null) {
					System.out.println("Reservation " + res);
				}else {
					System.out.println("Reservation " + res);
				}
		}
		
		sc.close();
	}
}
