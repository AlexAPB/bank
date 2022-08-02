package main;

import accounts.Conta;
import accounts.ContaCorrente;

public class Banco {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(1, 55, 500.00);
		System.out.println(c1);
	}
}
