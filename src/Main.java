
public class Main {

	public static void main(String[] args) {
		//Cria��o de clientes
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Cliente Reinan = new Cliente();
		Reinan.setNome("Reinan");
		
		//cria��o de contas
		
		Conta cc_venilton = new ContaCorrente(venilton);
		Conta pc_venilton = new ContaPoupanca(venilton);
		
		Conta uc_Reinan = new ContaUniversitaria(Reinan);
		Conta pc_Reinan = new ContaPoupanca(Reinan);
		
		// movimenta��es do banco 
		
		cc_venilton.depositar(50);
		cc_venilton.transferir(10, pc_venilton);
		uc_Reinan.transferir(150, cc_venilton);
		uc_Reinan.transferir(100, pc_Reinan);
		pc_Reinan.transferir(50, uc_Reinan);
		
		
		
		
		cc_venilton.imprimirExtrato();
		pc_venilton.imprimirExtrato();
		
		uc_Reinan.imprimirExtrato();
		pc_Reinan.imprimirExtrato();
		
		
	}

}
