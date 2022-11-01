package Banco;

public class ContaPoupanca extends Conta {
	
	private int diaAniversario;
	private double txJuros;
	
	public ContaPoupanca(int nrConta, int nrAgencia, String nmBanco, double vlSaldo, int diaAniversario,
			double txJuros) {
		super(nrConta, nrAgencia, nmBanco, vlSaldo);
		this.diaAniversario = diaAniversario;
		this.txJuros = txJuros;
	}
	
	@Override
	public double getVlSaldo() {
		if (this.diaAniversario == 29) return this.vlSaldo += this.txJuros * this.vlSaldo;
		else return this.vlSaldo;
		
	}	

}
