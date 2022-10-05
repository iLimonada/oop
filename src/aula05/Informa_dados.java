package aula05;

import javax.swing.JOptionPane;
public class Informa_dados {
	public static void main(String args[]) {
		Dados_Contribuintes dados = new Dados_Contribuintes();
		
		String nm, cpf, cn, cd;
		
		nm 	= JOptionPane.showInputDialog(null, "Digite o Nome");
		cpf = JOptionPane.showInputDialog(null, "Digite o CPF");
		cn  = JOptionPane.showInputDialog(null, "Digite o CNPJ");
		cd  = JOptionPane.showInputDialog(null, "Digite o Cartão");
		
		dados.setNome(nm);
		dados.setCPF(cpf);
		dados.setCNPJ(cn);
		dados.setCartao(cd);
		
		JOptionPane.showMessageDialog(null, "DADOS CONTRIBUINTE \n" + 
				" Nome: " + dados.getNome() +
				"\n CPF: " + dados.getCPF() +
				"\n CNPJ: " + dados.getCNPJ() +
				"\n Cartao: " + dados.getCartao(), "", JOptionPane.PLAIN_MESSAGE);
		
		
		/*a.setNome("Daniela Bento");
		a.setCPF("001.002.003-45");
		a.setCNPJ("776 998 /0001");
		a.setCartao("9776-J");
		System.out.println("nome do contribuinte: " + a.getNome());
		System.out.println("CPF do contribuinte: " + a.getCPF());
		System.out.println("CNPJ do contribuinte: " + a.getCNPJ());
		System.out.println("Cartao do contribuinte: " + a.getCartao());*/
		
		
	}
}
