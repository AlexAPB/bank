package accounts;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean sacar(float value) {
		if(saldo >= value) {
			saldo -= value;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean depositar(float value) {
		saldo += value;
		
		return true;
	}

	@Override
	public boolean transferir(float value, Conta destiny) {
		if(sacar(value)) {
			destiny.depositar(value);
			return true;
		}
		
		return false;
	}



	
	
}
