package aula08;

public class Acessa_Faculdade{
	
	public static void main(String args[]) {
		Faculdade_CEETEPs ceetps = new Faculdade_CEETEPs();
		
		Disciplinas_CEETEPs disciplinas = new Disciplinas_CEETEPs();
		
	ceetps.setFatec("Fatec Baixada Santista");
	System.out.println("Fatec \t"+ ceetps.getFatec());
	
	ceetps.setFaculdade("Administração e Desenvolvimento de Sistemas");
	System.out.println("Faculdade \t" + ceetps.getFaculdade());
	
	disciplinas.setDisciplina("Programação Orientada a Objetos");
	System.out.println("disciplina \t" + disciplinas.getDisciplina());
	}
}