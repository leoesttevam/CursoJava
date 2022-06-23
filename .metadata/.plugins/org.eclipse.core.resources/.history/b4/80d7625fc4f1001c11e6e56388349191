package entities;

public class Celular {

	private String modelo;
	private String marca;
	private int bateria;
	private String operadora;
	
	public Celular() {
		
	}
	
	public Celular(String modelo, String marca, int bateria, String operadora) {
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = bateria;
		this.operadora = operadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public void carga() {
		if(bateria <= 1) {
			System.out.println("Celular desligado");
		}else if(bateria <= 5) {
			System.out.println("Celular esta descarregado");
		}else if(bateria <= 15) {
			System.out.println("Bateria esta em 15% conecta o carregador");
		}
	}

	@Override
	public String toString() {
		return "\nMarca: " + marca + "\nModelo: " + modelo + "\nOperadora: " + operadora + "\nBateria: " + bateria + "% ";
	}
	
	
}
