package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	private Double lagura;
	private Double altura;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Color color, Double lagura, Double altura) {
		super(color);
		this.lagura = lagura;
		this.altura = altura;
	}

	public Double getLagura() {
		return lagura;
	}

	public void setLagura(Double lagura) {
		this.lagura = lagura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return lagura * altura;
	}

}
