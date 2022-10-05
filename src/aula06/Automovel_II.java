package aula06;
import java.text.*;

public class Automovel_II {
	
	private static int ano;
	String marca;
	String modelo;
	String cor;
	private static double preco;
	
	//Formatar a quantidade de casas decimais com a biblioteca importada
	NumberFormat nf = NumberFormat.getNumberInstance();
	
	Automovel_II(int ano, String marca, double preco)
	/* parametros dos atributos com
	 * os mesmo nomes:
	 * usa-se a referencia this*/
	{
		this.ano = ano;
		this.marca = marca;
		modelo = "Alpera";
		cor = "vermelho";
		this.preco = preco;
	}
	
	public static double atualizaPreco(double valor) {
		return preco = (valor * ano / 1988);
	}
	
	public void mostracarro() {
		System.out.println("\n" +"carro marca" + "\t" + marca + "\n" + "modelo" 
	+ "\t" + modelo + "\n" + "ano" + "\t" + ano + "\n" + "cor" + "\t" + cor + 
	"\n" + "preco" + "\t" + nf.format(atualizaPreco(7654.99)));
	}
}
