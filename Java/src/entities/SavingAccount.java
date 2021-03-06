package entities;

public class SavingAccount extends Account{

	private Double txaJuros;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String titular, Double saldo, Double txaJuros) {
		super(number, titular, saldo);
		this.txaJuros = txaJuros;
	}

	public Double getTxaJuros() {
		return txaJuros;
	}

	public void setTxaJuros(Double txaJuros) {
		this.txaJuros = txaJuros;
	}
	
	public void updateSaldo() {
		saldo += saldo * txaJuros;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}
}
