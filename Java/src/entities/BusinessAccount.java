package entities;

public class BusinessAccount extends Account{

	private Double limitEmprestimo;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String titular, Double saldo, Double limitEmprestimo) {
		super(number, titular, saldo);
		this.limitEmprestimo = limitEmprestimo;
	}

	public Double getLimitEmprestimo() {
		return limitEmprestimo;
	}

	public void setLimitEmprestimo(Double limitEmprestimo) {
		this.limitEmprestimo = limitEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if(valor <= limitEmprestimo) {
			saldo += valor - 10.0;
		}
	}
	
	//Sobreposição palavra super
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
}
