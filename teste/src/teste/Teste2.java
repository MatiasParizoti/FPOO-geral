package teste;
import java.util.Scanner;

public class Teste2 {
	objAlunos Alunos;
	objKayque Kayque;
	objFDP FDP;
	
	public void ExibirTeste(){
    Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao != 3) {
			
			System.out.println("ESCOLHA UMA OPÇÃO PELO NUMERO: ");
			System.out.println("1 - NOME DO ALUNO ");
			System.out.println("2 - KAYQUE É PRETO ");
			System.out.println("3 - KAYQUE É FDP ");
			System.out.println("4 - SAIR ");
			
			opcao = scanner.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("ALUNOS");
		break;
		
		case 2:
			System.out.println("KAYQUE PRETO");
		break;
		case 3:
			System.out.println("KAYQUE FDP");
		break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}
		}
	}

}
