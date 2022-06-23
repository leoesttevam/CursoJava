package entities;

public class Monitor {

	private String marca;
	private String modelo;
	private double polegadas;
	private String cor;
	private boolean status;
	
	public Monitor() {
		
	}
	
	public Monitor(String marca, String modelo, double polegadas, String cor, boolean status) {
		this.marca = marca;
		this.modelo = modelo;
		this.polegadas = polegadas;
		this.cor = cor;
		this.status = status;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void statusMonitor() {
		if(status == true) {
			System.out.println("Monitor está ligado");
		}else {
			System.out.println("Monitor está desligado");
		}
	}

	@Override
	public String toString() {
		return "Monitor [marca=" + marca + ", modelo=" + modelo + ", polegadas=" + polegadas + ", cor=" + cor
				+ ", status=" + status + "]";
	}
	
	
}
