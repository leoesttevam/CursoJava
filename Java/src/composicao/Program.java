package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		String departmentNome = sc.nextLine();
		System.out.print("Enter worker data: ");
		System.out.println("Name: ");
		String workerNome = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		
		Worker worker = new Worker(workerNome, WorkerLevel.valueOf(workerLevel), salary, new Departamento(departmentNome));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value por hour: ");
			double value = sc.nextDouble();
			System.out.println("Duration (hours)");
			int hours = sc.nextInt();
			
			HourContract contact = new HourContract(contractDate, value, hours);
			worker.addContrato(contact);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/yyyy): ");
		String anoMes = sc.next();
		
		int mes = Integer.parseInt(anoMes.substring(0, 2));
		int ano = Integer.parseInt(anoMes.substring(3));
		
		System.out.println("Name: " + worker.getNome());
		System.out.println("Department: " + worker.getDepartamento().getNome());
		System.out.println("Income for " + anoMes + ": " + String.format("%.2f", worker.income(ano, mes)));
		
		sc.close();
	}
}
