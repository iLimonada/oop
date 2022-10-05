package aula04;

import javax.swing.JOptionPane;
public class Atendente_Livraria {
	
	public static void main(String args[]) {
		
		//Instance Var
		Livraria cultura = new Livraria();
		
		String a, b, c, d, e, i, j;
		int f, g;
		double h;
		
		JOptionPane.showMessageDialog(null, "Categoria: Digite\n 1 para Romance \n 2 para Espírita \n 3 para Informática");
		a = JOptionPane.showInputDialog(null, "Código");
		b = JOptionPane.showInputDialog(null, "Editora");
		c = JOptionPane.showInputDialog(null, "Autor");
		d = JOptionPane.showInputDialog(null, "Livro");
		e = JOptionPane.showInputDialog(null, "quantidade");
		i = JOptionPane.showInputDialog(null, "preço");
		j = JOptionPane.showInputDialog(null, "Ano de publicação");
		
		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		
		cultura.setEditora(b);
		cultura.setAutor(c);
		cultura.setLivro(d);
		cultura.setQuantidade(g);
		cultura.setPreco(h);
		cultura.setAno_Publi(j);
			
	
	//Metodos
		
		switch(f) {
		
		case 1: JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE \n" +
				" LIVRO: " + cultura.getLivro() +
				"\n EDITORA: " + cultura.getEditora() +
				"\n AUTOR: " + cultura.getAutor() +
				"\n ANO DE PUBLICAÇÃO: " + cultura.getAno_Publi() +
				"\n QUANTIDADE: " + cultura.getQuantidade() +
				"\n PREÇO R$: " + cultura.getPreco(), "", JOptionPane.PLAIN_MESSAGE); break;
				
		case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPÍRITA \n" +
				" LIVRO: " + cultura.getLivro() +
				"\n EDITORA: " + cultura.getEditora() +
				"\n AUTOR: " + cultura.getAutor() +
				"\n ANO DE PUBLICAÇÃO: " + cultura.getAno_Publi() +
				"\n QUANTIDADE: " + cultura.getQuantidade() +
				"\n PREÇO R$: " + cultura.getPreco(), "", JOptionPane.PLAIN_MESSAGE); break;
				
		case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTCA \n" +
				" LIVRO: " + cultura.getLivro() +
				"\n EDITORA: " + cultura.getEditora() +
				"\n AUTOR: " + cultura.getAutor() +
				"\n ANO DE PUBLICAÇÃO: " + cultura.getAno_Publi() +
				"\n QUANTIDADE: " + cultura.getQuantidade() +
				"\n PREÇO R$: " + cultura.getPreco(), "", JOptionPane.PLAIN_MESSAGE); break;
				
		default: System.out.println("Código não corresponde a nenhuma categoria de livro");
		}
	}
}
		
	

