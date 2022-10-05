package aula05;

public class Identifica_Dispositivel_Movel {
	public static void main(String args[]) {
		//primeira instancia
		Dispositivel_Movel a = new Dispositivel_Movel();
		a.identifica_numero("13 99655 8666");
		a.identifica_usuario("Carla");
		//segunda instancia
		Dispositivel_Movel b = new Dispositivel_Movel();
		b.identifica_numero("13 99777 6688");
		b.identifica_usuario("Giovana");
		
		System.out.println("numero do telefone " + a.numero);
		System.out.println("usuario do telefone " + a.usuario);
		
		System.out.println("numero do telefone " + b.numero);
		System.out.println("usuario do telefone " + b.usuario);
	
		b.DDD = 17;
		a.DDD = 16;
		
		System.out.println("DDD do telefone " + b.DDD);
		System.out.println("DDD do telefone " + a.DDD);
	
	}

}
