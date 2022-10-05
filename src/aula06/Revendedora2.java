package aula06;

public class Revendedora2 {
	
	public static void main(String args[]) {

	Automovel_II C = new Automovel_II(2000, "Ford", 5000.11);
	
	C.mostracarro();
	
	//finalizer (destrutor)
	C = null;
	System.gc();
	C.mostracarro();
	}
}
