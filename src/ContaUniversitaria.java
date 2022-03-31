
public class ContaUniversitaria extends Conta {
 
	
	
	public ContaUniversitaria(Cliente cliente) {
		super(cliente);
		depositar(100);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Universitaria ===");
		super.imprimirInfosComuns();
		
	}
	
	

}
