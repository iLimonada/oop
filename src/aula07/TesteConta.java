package aula07;

public class TesteConta {
	public static void main(String args[]) {
		
	Conta conta1 = new Conta();
	conta1.setnumero(29407);
	conta1.credito(100);
	conta1.debito(300);
	//conta1.debito1(200);
	System.out.println("conta1: numero = " + conta1.getnumero());
	System.out.println("conta1: saldo = " + conta1.getsaldo());
	System.out.println("conta1: saldo final = " + conta1.debito(200));
	System.out.println("conta1: saldo final com juros = " + conta1.credito(600));
	
	System.out.println();
	
	Conta conta2 = new Conta();
	conta2.setnumero(29406);
	conta2.credito(400);
	conta2.debito(100);
	//conta1.debito1(400);
	System.out.println("conta1:numero = " + conta2.getnumero());
	System.out.println("conta1:saldo = " + conta2.getsaldo());
	System.out.println("conta1:saldo final = " + conta2.debito(-600));
	System.out.println("conta1:saldo final com juros = " + conta2.credito(300));
	
	}
}

