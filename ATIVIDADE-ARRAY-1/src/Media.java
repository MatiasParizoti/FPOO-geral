import java.util.Scanner;

public class Media {
	
	String[] Nomes = new String[10];
	Scanner objScanner = new Scanner(System.in);
	
	void listarAlunos() {
	
		
			for(int indice = 0;indice < Nomes.length;indice++) {
		
		System.out.println("DIGITE UM NOME:");
		Nomes[indice] = objScanner.next();
		
		
		}
			for(int indice = 0;indice < Nomes.length;indice++) {
				System.out.println((indice +1)+"º NOME :" + Nomes[indice]);
			}
		
		System.out.println("TOTAL DE Nomes: " + Nomes.length);
		
		
	}



}
