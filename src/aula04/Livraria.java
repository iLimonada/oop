package aula04;

public class Livraria {
	
	//Attributes
	private String editora;
	private String autor;
	private String livro;
	private String ano_publi;
	private int quantidade;
	private double preco;
	
	public void setEditora(String editora) {
		this.editora = editora; }
	
	public void setAutor(String autor) {
		this.autor = autor; }
	
	public void setLivro(String livro) {
		this.livro = livro; }
	
	public void setAno_Publi(String ano_publi) {
		this.ano_publi = ano_publi; }
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getEditora() {
		return editora;	}
	
	public String getAutor() {
		return autor; }
	
	public String getLivro() {
		return livro; }
	
	public String getAno_Publi() {
		return ano_publi; }
	
	public double getPreco() {
		return preco; }
	
	public int getQuantidade() {
		return quantidade;
	}
}
