package model.entities;

public class Invoice {

	private Double basicPayment;
	private Double taxa;
	
	public Invoice() {
	}

	public Invoice(Double basicPayment, Double taxa) {
		this.basicPayment = basicPayment;
		this.taxa = taxa;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTaxa();
	}

}
