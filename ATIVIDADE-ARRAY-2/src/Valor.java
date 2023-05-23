import java.util.Scanner;
public class Valor {

	int[] Valores1 = new int[10];
	int[] Valores2 = new int[10];
	Scanner objScanner = new Scanner(System.in);
	
	public void Numeros() {
																							
		System.out.println("INSIRA 10 NUMEROS");
		for(int indice = 0; indice < Valores1.length; indice++) {
			Valores1[indice] = objScanner.nextInt();
		}
		
		for(int indice = 0; indice < Valores1.length; indice++) {
			Valores2[indice] = Valores1[indice] * 3;
		}
		
		
		System.out.println("VALORES INSERIDOS");
		for(int indice = 0; indice < Valores1.length; indice++) {
			System.out.println(Valores1[indice]);
		}

		System.out.println("VALORES MULTIPLICADOS");
		for(int indice = 0; indice < Valores2.length; indice++) {
			System.out.println(Valores2[indice]); 
		}
		
	}
	
}
