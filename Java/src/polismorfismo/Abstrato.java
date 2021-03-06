package polismorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Abstrato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner  sc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<Shape>();
		
		System.out.println("Enter the number of shapes ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shapes #" + i + " data:");
			System.out.println("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			
			System.out.println("Color (Black/Blue/Red):");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double heigth = sc.nextDouble();
				shape.add(new Rectangle(color, width, heigth));
			}else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				shape.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape list : shape) {
			System.out.printf(String.format("%.2f%n", list.area()));
		}
		
		sc.close();
	}
}
