package entities;

public class OutsourcedEmployee extends Employee{

	private Double addCharge;
	
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String nome, Integer horas, Double valorHora, Double addCharge) {
		super(nome, horas, valorHora);
		this.addCharge = addCharge;
	}

	public Double getAddCharge() {
		return addCharge;
	}

	public void setAddCharge(Double addCharge) {
		this.addCharge = addCharge;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + + addCharge * 1.1;
	}
}
