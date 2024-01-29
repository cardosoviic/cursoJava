package pooTurma;

public class Alunos {

	
	public static void main (String[] args) {
		//Objeto1 
		Turma aluno1 = new Turma();
		
		aluno1.nome = "Nathan";
		aluno1.telefone = "11992682158";
		aluno1.emailPessoal = "nathan.martins2004@gmail.com";
		aluno1.emailEducacional = "nathan.mraphael@senacsp.edu.br";
		aluno1.mencao = "ND";
		System.out.println("Nome do aluno: " + aluno1.nome);
		System.out.println("Telefone: " +  aluno1.telefone);	
		System.out.println("Email: " + aluno1.emailPessoal);
		aluno1.ligarPc();
		aluno1.logar();
		
		
		//Objeto2 
		Turma aluno2 = new Turma();

		aluno2.nome = "Victória";
		aluno2.telefone = "11986080091";
		aluno2.emailPessoal = "victoriacardoso545@gmail.com";
		System.out.println("Nome do aluno: " + aluno2.nome);
		System.out.println("Telefone: " + aluno2.telefone);
		System.out.println("Email: " + aluno2.emailPessoal);
		aluno2.emailEducacional = "victoria.acreis@senacsp.edu.br";
		aluno2.mencao = "D";
		aluno2.ligarPc();
		aluno2.desligarPc();
		
	}
	
}
