package heranca;

public class superclasse {
	
	private String attribute_1;
	
	superclasse(){
		System.out.println("acesso ao metodo construtor da superclasse");
	}
	
	public void set_Attribute_1(String attribute_1) {
		this.attribute_1 = attribute_1;
	}
	
	public String get_Attribute_1() {
		return attribute_1;
	}
	
	
}
