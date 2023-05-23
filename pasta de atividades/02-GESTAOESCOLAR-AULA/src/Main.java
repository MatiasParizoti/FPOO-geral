import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner objetoScanner =  new Scanner(System.in);
		Professor objetoProfessor = new Professor();
		Disciplina objetoDisciplina = new Disciplina();
		Aluno objetoAluno = new Aluno();
		Media objetoMedia  = new Media();
		
		/* PROFESSOR*/
		
		System.out.println("DIGITE O NOME DO PROFESSOR(A)");
		objetoProfessor.setNoneProfessor(objetoScanner.next());
		
		/* DISCIPLINA */
		
		System.out.println("DIGITE O NOME DA DISCIPLINA(A)");
		objetoDisciplina.setNomeDisciplina(objetoScanner.next());
		
		/* ALUNO */
		
		System.out.println("DIGITE O NOME DO ALUNO(A)");
		objetoAluno.setNomeAluno(objetoScanner.next());
		
		/* MEDIA */
		
		System.out.println("DIGITE A PRIMEIRA NOTA");
		objetoMedia.setNota1(objetoScanner.nextFloat());
		
		System.out.println("DIGITE A SEGUNDA  NOTA");
		objetoMedia.setNota2(objetoScanner.nextFloat());
		
		System.out.println("DIGITE A TERCEIRA  NOTA");
		objetoMedia.setNota3(objetoScanner.nextFloat());
		
		System.out.println("DIGITE A QUARTA NOTA");
		objetoMedia.setNota4(objetoScanner.nextFloat());
		
		
		System.out.println("NOME DO PROFESSOR(A): " + objetoProfessor.getNoneProfessor());
		System.out.println("NOME DA DISCIPLINA: " + objetoDisciplina.getNomeDisciplina());
		System.out.println("NOME DO ALUNO(A): " + objetoAluno.getNomeAluno());
		System.out.println("MEDIA: " + objetoMedia.calcularMedia());-
		

	}

}
