package aula07;

public class Conta {
	
	private int numero;
	private double saldo;
	private double juros;
	//metodos de consulta
	public double getnumero() {
		return numero;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	//metodos de alteracao
	public void setnumero(int numero) {
		this.numero = numero;
	}
	
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodo de operacoes
	public double debito(double valor) {
		return saldo -= valor;
	}
	public double credito(double valor) {
		return saldo += valor;
	}
}
