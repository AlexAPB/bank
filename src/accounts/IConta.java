package accounts;

public interface IConta {
	
	boolean transferir(float value, Conta destiny);
	boolean sacar(float value);
	boolean depositar(float value);
}
