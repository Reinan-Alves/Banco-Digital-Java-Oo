
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	@Override
	public void sacar(double valor) {
		double juros = valor * 0.01;
		if(this.saldo >= valor + juros) {
			sacou = true;
			saldo -= valor + juros;
		}else {
			sacou = false;
			System.err.println("SALDO INSUFICIENTE OPERAÇÃO NÃO REALIZADA");
		}
	}
}
