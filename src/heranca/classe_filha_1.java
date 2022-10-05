package heranca;

public class classe_filha_1 extends superclasse {
	
	//attribute
	private String attribute_2;
	
	classe_filha_1(){
		super();
		System.out.println("acesso ao metodo construtor da classe_filha_1\n");
	}
	
	public void set_Attribute_2(String attribute_2) {
		this.attribute_2 = attribute_2;
	}
	
	public String get_Attribute_2() {
		return attribute_2;
	}
}
