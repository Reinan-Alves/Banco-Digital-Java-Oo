
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	@Override
	public void sacar(double valor) {
		double juros = valor * 0.10;
		if(this.saldo >= valor + juros) {
			sacou = true;
			saldo -= valor + juros;
		}else {
			sacou = false;
			System.err.println("SALDO INSUFICIENTE OPERAÇÃO NÃO REALIZADA");
		}
	}
}
