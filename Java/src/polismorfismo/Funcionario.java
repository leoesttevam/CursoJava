package polismorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			System.out.println("Employee #" + i + " data");
			System.out.println("Outsourced(s/n)");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Hours: ");
			int hora= sc.nextInt();
			System.out.println("Value por hour: ");
			double valor = sc.nextDouble();
			
			if(ch == 's') {
				System.out.println("Additional charge: ");
				double add = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(nome, hora, valor, add);
				
				list.add(emp);
				}else {
					Employee emp = new Employee(nome, hora, valor);
					list.add(emp);
				}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
		}
		sc.close();
	}
}
