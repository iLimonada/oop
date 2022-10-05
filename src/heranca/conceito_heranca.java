package heranca;

public class conceito_heranca {
	
	public static void main(String args[]) {
		
		classe_filha_2 a = new classe_filha_2();
		classe_filha_3 b = new classe_filha_3();
		
		//classe_filha_2
		
		System.out.println("\nexecutable class of classe_filha_2");
		a.set_Attribute_1("valor of attribute 1");
		a.set_Attribute_2("valor of attribute 2");
		System.out.println(a.get_Attribute_1());
		System.out.println(a.get_Attribute_2());


		//classe_filha_3
		System.out.println("\nexecutable classe of classe_filha_3");
		b.set_Attribute_1("valor of attribute 1");
		b.set_Attribute_2("valor of attribute 2");
		System.out.println(b.get_Attribute_1());
		System.out.println(b.get_Attribute_2());
	}
	
}
